package com.pxg.model;

import java.util.Date;

/** @ProjectName��Job20190426
 * @ClassName: AccountModel
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������4:13:27
 */

public class AccountModel {

	 /**
	   * id
	   */
	  private Integer ID;
	  /**
	   * ����
	   */
	  private String NAME;
	  /**
	   * ����
	   */
	  private String PASSWORD;
	  /**
	   * �Ա�
	   */
	  private String GENDER;
	  /**
	   * ���֤��
	   */
	  private String IDNUMBER;
	  /**
	   * �������
	   */
	  private Double OPENINGAMOUNT;
	  /**
	   * ����ʱ��
	   */
	  private Date OPENINGTIME;
	  /**
	   * ���
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
