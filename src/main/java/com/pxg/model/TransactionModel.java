package com.pxg.model;

import java.util.Date;

/** @ProjectName��Job20190426
 * @ClassName: TransactionModel
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������4:14:29
 */

public class TransactionModel {

	/**
	   * ����id
	   */
	  private Integer ID;
	  /**
	   * �����˻�
	   */
	  private Integer ACCOUNTID;
	  /**
	   * ��������
	   */
	  private String TYPE;
	  /**
	   * ����ʱ��
	   */
	  private Date TIME;
	  /**
	   * ���׽��
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
