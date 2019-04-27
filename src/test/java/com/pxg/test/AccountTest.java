package com.pxg.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.pxg.model.AccountModel;
import com.pxg.model.TransactionModel;
import com.pxg.service.AccountService;
import com.pxg.util.ContextUtil;

/** @ProjectName��Job20190426
 * @ClassName: AccountTest
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������5:03:15
 */

public class AccountTest extends ContextUtil{

	 AccountService as = (AccountService) getByAnnotation("AccountServiceImpl");
	
	 /**
	  * @Title: insertAccount
	  * @Description: TODO( A��������ע��һ���˻�   )
	  * @param     ����
	  * @return void ��������
	  */
	 @Test
	 public void insertAccount() {
		 AccountModel aModel = new AccountModel();
		 aModel.setNAME("������");
		 aModel.setPASSWORD("123");
		 aModel.setGENDER("��");
		 aModel.setOPENINGAMOUNT(100.00);
		 aModel.setIDNUMBER("123");
		 System.out.println("������"+as.insertAccount(aModel)+"��id��"+aModel.getID());
	 }
	 
	 /**
	  * @Title: updateAccount
	  * @Description: TODO(B���޸����룺�޸�����֮ǰ������֤ԭ�����Ƿ���ȷ)
	  * @param     ����
	  * @return void ��������
	  */
	 @Test
	 public void updateAccount() {
		 System.out.println(as.updatePassword(3, "234", "123").toString());
	 }
	 
	 /**
	  * @Title: withdrawal
	  * @Description: TODO(ȡ��)
	  * @param     ����
	  * @return void ��������
	  */
	 @Test
	 public void withdrawal() {
		 Map<String, Object> map = new HashMap<String, Object>();
		 map.put("money", 10);
		 map.put("id", 3);
		 System.out.println(as.updateWithdrawal(map));
	 }
	 
	 /**
	  * @Title: updateTransfer
	  * @Description: TODO(ת��)
	  * @param     ���� 
	  * @return void ��������
	  */
	 @Test
	 public void updateTransfer() {
		 System.out.println(as.updateTransfer(3, 4, 50.00).toString());
	 }
	 
	 /**
	  * @Title: accountChecking
	  * @Description: TODO(����)
	  * @param     ����
	  * @return void ��������
	  */
	 @Test
	 public void accountChecking() {
		System.out.println(as.accountChecking(3));
	}
	 
	 /**
	  * @Title: findTransaction
	  * @Description: TODO(��ѯĳһ�˻������н��׼�¼)
	  * @param     ����
	  * @return void ��������
	  */
	 @Test
	 public void findTransaction() {
		 TransactionModel transactionModel = new TransactionModel();
		 transactionModel.setACCOUNTID(3);
		 List<TransactionModel> list = as.findTransaction(transactionModel);
		 for (TransactionModel transactionModel2 : list) {
			 System.out.println(transactionModel2.toString());
		}
		
	 }
}































