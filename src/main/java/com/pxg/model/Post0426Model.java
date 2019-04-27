package com.pxg.model;

import java.util.Date;

/**
 * @ProjectName：Job20190426
 * @ClassName: Post0426
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生） @date：2019年4月26日下午10:06:16
 */

public class Post0426Model {

	private Integer ID;
	private Integer USERID;
	private Date POSTDATE;
	private String CONTENTID;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getUSERID() {
		return USERID;
	}

	public void setUSERID(Integer uSERID) {
		USERID = uSERID;
	}

	public Date getPOSTDATE() {
		return POSTDATE;
	}

	public void setPOSTDATE(Date pOSTDATE) {
		POSTDATE = pOSTDATE;
	}

	public String getCONTENTID() {
		return CONTENTID;
	}

	public void setCONTENTID(String cONTENTID) {
		CONTENTID = cONTENTID;
	}

	@Override
	public String toString() {
		return "Post0426 [ID=" + ID + ", USERID=" + USERID + ", POSTDATE=" + POSTDATE + ", CONTENTID=" + CONTENTID
				+ "]";
	}

}
