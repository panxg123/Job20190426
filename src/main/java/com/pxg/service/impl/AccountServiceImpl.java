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

/** @ProjectName：Job20190426
 * @ClassName: AccountServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午5:04:05
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

	/** (非 Javadoc)
	* @param accountModel
	* @return
	* @see com.pxg.service.AccountService#insertAccount(com.pxg.model.AccountModel)
	*/

	@Override
	public int insertAccount(AccountModel accountModel) {
		return accountDao.insertAccount(accountModel);
	}

	/** (非 Javadoc)
	* @param accountModel
	* @return
	* @see com.pxg.service.AccountService#findAccount(com.pxg.model.AccountModel)
	*/

	@Override
	public List<AccountModel> findAccount(AccountModel accountModel) {
		return accountDao.findAccount(accountModel);
	}

	/** (非 Javadoc)
	* @param accountModel
	* @return
	* @see com.pxg.service.AccountService#deleteAccount(com.pxg.model.AccountModel)
	*/

	@Override
	public int deleteAccount(AccountModel accountModel) {
		return accountDao.deleteAccount(accountModel);
	}

		
	 /** (非 Javadoc)
	 * @param aid
	 * @param oldPass
	 * @param newPass
	 * @return
	 * @see com.pxg.service.AccountService#modifiPassword(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	    
	@Override
	public PasswordStatusUtil updatePassword(Integer aid, String oldPass, String newPass) {
		// 判断新密码是否不为空
		if (StringUtils.isEmpty(newPass)) {
			return PasswordStatusUtil.NEW_PASSWORD_NOT_EMPTY;
		}
		//判断旧密码是否为空
		if (StringUtils.isEmpty(oldPass)) {
			return PasswordStatusUtil.OLD_PASSWORD_NOT_EMPTY;
		}
		AccountModel accountModel = new AccountModel();
		accountModel.setID(aid);
		AccountModel aModel = accountDao.findAccount(accountModel).get(0);
		//判断旧密码是否正确
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

		
	 /** (非 Javadoc)
	 * @param map
	 * @return
	 * @see com.pxg.service.AccountService#updateWithdrawal(java.util.HashMap)
	 */
	    
	@Override
	public int updateWithdrawal(Map<String, Object> map) {
		return accountDao.updateWithdrawal(map);
	}

		
	 /** (非 Javadoc)
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
		//判断转账金额是否小于等于存款余额
		if(aModel.getBLANCE()<money){
			return TransferStatusUtil.NOT_ENOUGTH;
		}
		//进行余额的增减,交易记录新增
		try {
			//转账人进行余额相减
			aModel.setBLANCE(aModel.getBLANCE()-money);
			accountDao.updateAccount(aModel);
			//收款人进行余额相加
			aModel2.setBLANCE(aModel2.getBLANCE()+money);
			accountDao.updateAccount(aModel2);
			//添加转出人交易记录
			TransactionModel tModel = new TransactionModel();
			tModel.setACCOUNTID(from);
			tModel.setTYPE("转出");
			tModel.setAMOUNT(money);
			transactionDao.insertTransaction(tModel);
			//添加转入人交易记录
			TransactionModel tModel2 = new TransactionModel();
			tModel2.setACCOUNTID(to);
			tModel2.setTYPE("转入");
			tModel2.setAMOUNT(money);
			transactionDao.insertTransaction(tModel2);
			return TransferStatusUtil.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return TransferStatusUtil.FAILURE;
		}
	}

		
	 /** (非 Javadoc)
	 * @param id
	 * @return
	 * @see com.pxg.service.AccountService#accountChecking(java.lang.Integer)
	 */
	    
	@Override
	public boolean accountChecking(Integer id) {
		//查询原始余额
		AccountModel accountModel = new AccountModel();
		accountModel.setID(id);
		AccountModel aModel = accountDao.findAccount(accountModel).get(0);
		//查询转出和取出金额
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

		
	 /** (非 Javadoc)
	 * @param transactionModel
	 * @return
	 * @see com.pxg.service.AccountService#findTransaction(com.pxg.model.TransactionModel)
	 */
	    
	@Override
	public List<TransactionModel> findTransaction(TransactionModel transactionModel) {
		return transactionDao.findTransaction(transactionModel);
	}
	
}
