package com.pxg.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pxg.model.AccountModel;
import com.pxg.model.TransactionModel;
import com.pxg.util.PasswordStatusUtil;
import com.pxg.util.TransferStatusUtil;

/** @ProjectName：Job20190426
 * @ClassName: AccountService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午4:24:41
 */

public interface AccountService {


	/**
	 * @Title: insertAccount
	 * @Description: TODO(注册)  
	 * @param  @param accountModel
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public int insertAccount(AccountModel accountModel);
	
	/**
	 * @Title: updateAccount
	 * @Description: TODO(根据id进行修改  )
	 * @param  @param accountModel
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public PasswordStatusUtil updatePassword(Integer aid,String oldPass,String newPass);
	
	/**
	 * @Title: findAccount
	 * @Description: TODO(查询全部或者根据类型进行查询)
	 * @param  @param accountModel
	 * @param  @return   参数
	 * @return List<AccountModel> 返回类型
	 */
	public List<AccountModel> findAccount(AccountModel accountModel);
	
	/**
	 * @Title: deleteAccount
	 * @Description: TODO(根据id进行删除)
	 * @param  @param accountModel
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public int deleteAccount(AccountModel accountModel);
	
	/**
	 * @Title: updateWithdrawal
	 * @Description: TODO(取款使用)
	 * @param  @param accountModel
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public int updateWithdrawal(Map<String, Object> map);
	
	/**
	 * @Title: transfer
	 * @Description: TODO(转账使用)
	 * @param  @param to 对方id
	 * @param  @param from 我方id
	 * @param  @param money 金额
	 * @param  @return   参数
	 * @return TransferStatusUtil 返回类型
	 */
	public TransferStatusUtil updateTransfer(Integer to,Integer from,Double money);
	
	/**
	 * @Title: accountChecking
	 * @Description: TODO(对账)
	 * @param  @param id
	 * @param  @return   参数
	 * @return boolean 返回类型
	 */
	public boolean accountChecking(Integer id);
	
	/**
	 * @Title: findTransaction
	 * @Description: TODO(根据任意值查询)
	 * @param  @param transactionModel
	 * @param  @return   参数
	 * @return List<TransactionModel> 返回类型
	 */
	public List<TransactionModel> findTransaction(TransactionModel transactionModel);
}
