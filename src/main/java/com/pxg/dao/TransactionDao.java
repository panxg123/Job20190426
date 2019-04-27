package com.pxg.dao;

import java.util.List;
import java.util.Map;

import com.pxg.model.TransactionModel;

/** @ProjectName：Job20190426
 * @ClassName: TransactionDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午8:24:11
 */

public interface TransactionDao {

	/**
	 * @Title: insertTransaction
	 * @Description: TODO(添加一条记录)
	 * @param  @param transaction
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public int insertTransaction(TransactionModel transactionModel);
	
	/**
	 * @Title: findTransaction
	 * @Description: TODO(根据任意值查询)
	 * @param  @param transactionModel
	 * @param  @return   参数
	 * @return List<TransactionModel> 返回类型
	 */
	public List<TransactionModel> findTransaction(TransactionModel transactionModel);
	
	/**
	 * @Title: findByTypeMoney
	 * @Description: TODO(查询存入转入或取出转出金额)
	 * @param  @param map
	 * @param  @return   参数
	 * @return Double 返回类型
	 */
	public Double findByTypeMoney(Map<String, Integer> map);
}
