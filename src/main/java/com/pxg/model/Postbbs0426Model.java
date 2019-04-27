package com.pxg.model;

import java.util.Date;

/**
 * @ProjectName：Job20190426
 * @ClassName: Postbbs0426
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生） @date：2019年4月26日下午10:07:16
 */

public class Postbbs0426Model {

	private Integer ID;
	private Integer POSTID;
	private Integer SENDID;
	private Integer REPLYID;
	private Date POSTBBSDATE;
	private String CONTENTID;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getPOSTID() {
		return POSTID;
	}

	public void setPOSTID(Integer pOSTID) {
		POSTID = pOSTID;
	}

	public Integer getSENDID() {
		return SENDID;
	}

	public void setSENDID(Integer sENDID) {
		SENDID = sENDID;
	}

	public Integer getREPLYID() {
		return REPLYID;
	}

	public void setREPLYID(Integer rEPLYID) {
		REPLYID = rEPLYID;
	}

	public Date getPOSTBBSDATE() {
		return POSTBBSDATE;
	}

	public void setPOSTBBSDATE(Date pOSTBBSDATE) {
		POSTBBSDATE = pOSTBBSDATE;
	}

	public String getCONTENTID() {
		return CONTENTID;
	}

	public void setCONTENTID(String cONTENTID) {
		CONTENTID = cONTENTID;
	}

	@Override
	public String toString() {
		return "Postbbs0426 [ID=" + ID + ", POSTID=" + POSTID + ", SENDID=" + SENDID + ", REPLYID=" + REPLYID
				+ ", POSTBBSDATE=" + POSTBBSDATE + ", CONTENTID=" + CONTENTID + "]";
	}

}
