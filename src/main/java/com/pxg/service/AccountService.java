package com.pxg.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pxg.model.AccountModel;
import com.pxg.model.TransactionModel;
import com.pxg.util.PasswordStatusUtil;
import com.pxg.util.TransferStatusUtil;

/** @ProjectName��Job20190426
 * @ClassName: AccountService
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������4:24:41
 */

public interface AccountService {


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
	public PasswordStatusUtil updatePassword(Integer aid,String oldPass,String newPass);
	
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
	
	/**
	 * @Title: accountChecking
	 * @Description: TODO(����)
	 * @param  @param id
	 * @param  @return   ����
	 * @return boolean ��������
	 */
	public boolean accountChecking(Integer id);
	
	/**
	 * @Title: findTransaction
	 * @Description: TODO(��������ֵ��ѯ)
	 * @param  @param transactionModel
	 * @param  @return   ����
	 * @return List<TransactionModel> ��������
	 */
	public List<TransactionModel> findTransaction(TransactionModel transactionModel);
}
