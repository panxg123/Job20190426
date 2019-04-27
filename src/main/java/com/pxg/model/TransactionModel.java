package com.pxg.model;

import java.util.Date;

/** @ProjectName：Job20190426
 * @ClassName: TransactionModel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午4:14:29
 */

public class TransactionModel {

	/**
	   * 交易id
	   */
	  private Integer ID;
	  /**
	   * 交易账户
	   */
	  private Integer ACCOUNTID;
	  /**
	   * 交易类型
	   */
	  private String TYPE;
	  /**
	   * 交易时间
	   */
	  private Date TIME;
	  /**
	   * 交易金额
	   */
	  private Double AMOUNT;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getACCOUNTID() {
		return ACCOUNTID;
	}
	public void setACCOUNTID(Integer aCCOUNTID) {
		ACCOUNTID = aCCOUNTID;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public Date getTIME() {
		return TIME;
	}
	public void setTIME(Date tIME) {
		TIME = tIME;
	}
	public Double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(Double aMOUNT) {
		AMOUNT = aMOUNT;
	}
	@Override
	public String toString() {
		return "TransactionModel [ID=" + ID + ", ACCOUNTID=" + ACCOUNTID + ", TYPE=" + TYPE + ", TIME=" + TIME
				+ ", AMOUNT=" + AMOUNT + "]";
	}
	  
}
