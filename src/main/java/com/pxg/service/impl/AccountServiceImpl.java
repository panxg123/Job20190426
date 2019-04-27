package com.pxg.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.pxg.dao.AccountDao;
import com.pxg.dao.TransactionDao;
import com.pxg.model.AccountModel;
import com.pxg.model.TransactionModel;
import com.pxg.service.AccountService;
import com.pxg.util.PasswordStatusUtil;
import com.pxg.util.TransferStatusUtil;

/** @ProjectName��Job20190426
 * @ClassName: AccountServiceImpl
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������5:04:05
 */

@Service(value = "AccountServiceImpl")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private TransactionDao transactionDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionDao(TransactionDao transactionDao) {
		this.transactionDao = transactionDao;
	}

	/** (�� Javadoc)
	* @param accountModel
	* @return
	* @see com.pxg.service.AccountService#insertAccount(com.pxg.model.AccountModel)
	*/

	@Override
	public int insertAccount(AccountModel accountModel) {
		return accountDao.insertAccount(accountModel);
	}

	/** (�� Javadoc)
	* @param accountModel
	* @return
	* @see com.pxg.service.AccountService#findAccount(com.pxg.model.AccountModel)
	*/

	@Override
	public List<AccountModel> findAccount(AccountModel accountModel) {
		return accountDao.findAccount(accountModel);
	}

	/** (�� Javadoc)
	* @param accountModel
	* @return
	* @see com.pxg.service.AccountService#deleteAccount(com.pxg.model.AccountModel)
	*/

	@Override
	public int deleteAccount(AccountModel accountModel) {
		return accountDao.deleteAccount(accountModel);
	}

		
	 /** (�� Javadoc)
	 * @param aid
	 * @param oldPass
	 * @param newPass
	 * @return
	 * @see com.pxg.service.AccountService#modifiPassword(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	    
	@Override
	public PasswordStatusUtil updatePassword(Integer aid, String oldPass, String newPass) {
		// �ж��������Ƿ�Ϊ��
		if (StringUtils.isEmpty(newPass)) {
			return PasswordStatusUtil.NEW_PASSWORD_NOT_EMPTY;
		}
		//�жϾ������Ƿ�Ϊ��
		if (StringUtils.isEmpty(oldPass)) {
			return PasswordStatusUtil.OLD_PASSWORD_NOT_EMPTY;
		}
		AccountModel accountModel = new AccountModel();
		accountModel.setID(aid);
		AccountModel aModel = accountDao.findAccount(accountModel).get(0);
		//�жϾ������Ƿ���ȷ
		if(!aModel.getPASSWORD().equals(oldPass)) {
			return PasswordStatusUtil.OLD_PASSWORD_ERROR;
		}
		try {
			aModel.setPASSWORD(newPass);
			accountDao.updateAccount(aModel);
			return PasswordStatusUtil.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

		
	 /** (�� Javadoc)
	 * @param map
	 * @return
	 * @see com.pxg.service.AccountService#updateWithdrawal(java.util.HashMap)
	 */
	    
	@Override
	public int updateWithdrawal(Map<String, Object> map) {
		return accountDao.updateWithdrawal(map);
	}

		
	 /** (�� Javadoc)
	 * @param to
	 * @param from
	 * @param money
	 * @return
	 * @see com.pxg.service.AccountService#transfer(java.lang.Integer, java.lang.Integer, java.lang.Double)
	 */
	    
	@Override
	public TransferStatusUtil updateTransfer(Integer to, Integer from, Double money) {
		AccountModel aModel3 = new AccountModel();
		aModel3.setID(to);
		AccountModel aModel = accountDao.findAccount(aModel3).get(0);
		aModel3.setID(from);
		AccountModel aModel2 = accountDao.findAccount(aModel3).get(0);
		//�ж�ת�˽���Ƿ�С�ڵ��ڴ�����
		if(aModel.getBLANCE()<money){
			return TransferStatusUtil.NOT_ENOUGTH;
		}
		//������������,���׼�¼����
		try {
			//ת���˽���������
			aModel.setBLANCE(aModel.getBLANCE()-money);
			accountDao.updateAccount(aModel);
			//�տ��˽���������
			aModel2.setBLANCE(aModel2.getBLANCE()+money);
			accountDao.updateAccount(aModel2);
			//���ת���˽��׼�¼
			TransactionModel tModel = new TransactionModel();
			tModel.setACCOUNTID(from);
			tModel.setTYPE("ת��");
			tModel.setAMOUNT(money);
			transactionDao.insertTransaction(tModel);
			//���ת���˽��׼�¼
			TransactionModel tModel2 = new TransactionModel();
			tModel2.setACCOUNTID(to);
			tModel2.setTYPE("ת��");
			tModel2.setAMOUNT(money);
			transactionDao.insertTransaction(tModel2);
			return TransferStatusUtil.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return TransferStatusUtil.FAILURE;
		}
	}

		
	 /** (�� Javadoc)
	 * @param id
	 * @return
	 * @see com.pxg.service.AccountService#accountChecking(java.lang.Integer)
	 */
	    
	@Override
	public boolean accountChecking(Integer id) {
		//��ѯԭʼ���
		AccountModel accountModel = new AccountModel();
		accountModel.setID(id);
		AccountModel aModel = accountDao.findAccount(accountModel).get(0);
		//��ѯת����ȡ�����
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("statu", 1);
		map.put("id", id);
		Double saveDouble = transactionDao.findByTypeMoney(map);
		if (saveDouble==null) {
			saveDouble = 0.0;
		}
		map.put("statu", 2);
		Double drawDouble = transactionDao.findByTypeMoney(map);
		if (drawDouble==null) {
			drawDouble = 0.0;
		}
		return aModel.getBLANCE()==aModel.getOPENINGAMOUNT()+saveDouble-drawDouble;
	}

		
	 /** (�� Javadoc)
	 * @param transactionModel
	 * @return
	 * @see com.pxg.service.AccountService#findTransaction(com.pxg.model.TransactionModel)
	 */
	    
	@Override
	public List<TransactionModel> findTransaction(TransactionModel transactionModel) {
		return transactionDao.findTransaction(transactionModel);
	}
	
}
