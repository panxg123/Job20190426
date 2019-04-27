package com.pxg.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.pxg.model.AccountModel;
import com.pxg.model.TransactionModel;
import com.pxg.service.AccountService;
import com.pxg.util.ContextUtil;

/** @ProjectName：Job20190426
 * @ClassName: AccountTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午5:03:15
 */

public class AccountTest extends ContextUtil{

	 AccountService as = (AccountService) getByAnnotation("AccountServiceImpl");
	
	 /**
	  * @Title: insertAccount
	  * @Description: TODO( A、开户：注册一个账户   )
	  * @param     参数
	  * @return void 返回类型
	  */
	 @Test
	 public void insertAccount() {
		 AccountModel aModel = new AccountModel();
		 aModel.setNAME("潘先生");
		 aModel.setPASSWORD("123");
		 aModel.setGENDER("男");
		 aModel.setOPENINGAMOUNT(100.00);
		 aModel.setIDNUMBER("123");
		 System.out.println("新增："+as.insertAccount(aModel)+"；id："+aModel.getID());
	 }
	 
	 /**
	  * @Title: updateAccount
	  * @Description: TODO(B、修改密码：修改密码之前必须验证原密码是否正确)
	  * @param     参数
	  * @return void 返回类型
	  */
	 @Test
	 public void updateAccount() {
		 System.out.println(as.updatePassword(3, "234", "123").toString());
	 }
	 
	 /**
	  * @Title: withdrawal
	  * @Description: TODO(取款)
	  * @param     参数
	  * @return void 返回类型
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
	  * @Description: TODO(转账)
	  * @param     参数 
	  * @return void 返回类型
	  */
	 @Test
	 public void updateTransfer() {
		 System.out.println(as.updateTransfer(3, 4, 50.00).toString());
	 }
	 
	 /**
	  * @Title: accountChecking
	  * @Description: TODO(对账)
	  * @param     参数
	  * @return void 返回类型
	  */
	 @Test
	 public void accountChecking() {
		System.out.println(as.accountChecking(3));
	}
	 
	 /**
	  * @Title: findTransaction
	  * @Description: TODO(查询某一账户的所有交易记录)
	  * @param     参数
	  * @return void 返回类型
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































