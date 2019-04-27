package com.pxg.model;

import java.util.Date;

/** @ProjectName：Job20190426
 * @ClassName: AccountModel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午4:13:27
 */

public class AccountModel {

	 /**
	   * id
	   */
	  private Integer ID;
	  /**
	   * 姓名
	   */
	  private String NAME;
	  /**
	   * 密码
	   */
	  private String PASSWORD;
	  /**
	   * 性别
	   */
	  private String GENDER;
	  /**
	   * 身份证号
	   */
	  private String IDNUMBER;
	  /**
	   * 开户金额
	   */
	  private Double OPENINGAMOUNT;
	  /**
	   * 开户时间
	   */
	  private Date OPENINGTIME;
	  /**
	   * 余额
	   */
	  private Double BLANCE;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getIDNUMBER() {
		return IDNUMBER;
	}
	public void setIDNUMBER(String iDNUMBER) {
		IDNUMBER = iDNUMBER;
	}
	public Double getOPENINGAMOUNT() {
		return OPENINGAMOUNT;
	}
	public void setOPENINGAMOUNT(Double oPENINGAMOUNT) {
		OPENINGAMOUNT = oPENINGAMOUNT;
	}
	public Date getOPENINGTIME() {
		return OPENINGTIME;
	}
	public void setOPENINGTIME(Date oPENINGTIME) {
		OPENINGTIME = oPENINGTIME;
	}
	public Double getBLANCE() {
		return BLANCE;
	}
	public void setBLANCE(Double bLANCE) {
		BLANCE = bLANCE;
	}
	@Override
	public String toString() {
		return "AccountModel [ID=" + ID + ", NAME=" + NAME + ", PASSWORD=" + PASSWORD + ", GENDER=" + GENDER
				+ ", IDNUMBER=" + IDNUMBER + ", OPENINGAMOUNT=" + OPENINGAMOUNT + ", OPENINGTIME=" + OPENINGTIME
				+ ", BLANCE=" + BLANCE + "]";
	}
	  
}
