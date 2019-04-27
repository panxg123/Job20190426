package com.pxg.dao;

import java.util.List;
import java.util.Map;

import com.pxg.model.TransactionModel;

/** @ProjectName��Job20190426
 * @ClassName: TransactionDao
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������8:24:11
 */

public interface TransactionDao {

	/**
	 * @Title: insertTransaction
	 * @Description: TODO(���һ����¼)
	 * @param  @param transaction
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int insertTransaction(TransactionModel transactionModel);
	
	/**
	 * @Title: findTransaction
	 * @Description: TODO(��������ֵ��ѯ)
	 * @param  @param transactionModel
	 * @param  @return   ����
	 * @return List<TransactionModel> ��������
	 */
	public List<TransactionModel> findTransaction(TransactionModel transactionModel);
	
	/**
	 * @Title: findByTypeMoney
	 * @Description: TODO(��ѯ����ת���ȡ��ת�����)
	 * @param  @param map
	 * @param  @return   ����
	 * @return Double ��������
	 */
	public Double findByTypeMoney(Map<String, Integer> map);
}
