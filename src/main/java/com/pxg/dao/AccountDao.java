package com.pxg.dao;

import java.util.List;
import java.util.Map;

import com.pxg.model.AccountModel;
import com.pxg.util.TransferStatusUtil;

/** @ProjectName��Job20190426
 * @ClassName: AccountDao
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������4:15:40
 */

public interface AccountDao {

	/**
	 * @Title: insertAccount
	 * @Description: TODO(ע��)  
	 * @param  @param accountModel
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int insertAccount(AccountModel accountModel);
	
	/**
	 * @Title: updateAccount
	 * @Description: TODO(����id�����޸�  )
	 * @param  @param accountModel
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int updateAccount(AccountModel accountModel);
	
	/**
	 * @Title: findAccount
	 * @Description: TODO(��ѯȫ�����߸������ͽ��в�ѯ)
	 * @param  @param accountModel
	 * @param  @return   ����
	 * @return List<AccountModel> ��������
	 */
	public List<AccountModel> findAccount(AccountModel accountModel);
	
	/**
	 * @Title: deleteAccount
	 * @Description: TODO(����id����ɾ��)
	 * @param  @param accountModel
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int deleteAccount(AccountModel accountModel);
	
	/**
	 * @Title: updateWithdrawal
	 * @Description: TODO(ȡ��ʹ��)
	 * @param  @param accountModel
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int updateWithdrawal(Map<String, Object> map);
	
	/**
	 * @Title: transfer
	 * @Description: TODO(ת��ʹ��)
	 * @param  @param to �Է�id
	 * @param  @param from �ҷ�id
	 * @param  @param money ���
	 * @param  @return   ����
	 * @return TransferStatusUtil ��������
	 */
	public TransferStatusUtil updateTransfer(Integer to,Integer from,Double money);
	
}
