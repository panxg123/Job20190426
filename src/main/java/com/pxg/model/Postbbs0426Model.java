package com.pxg.model;

import java.util.Date;

/**
 * @ProjectName��Job20190426
 * @ClassName: Postbbs0426
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS���������� @date��2019��4��26������10:07:16
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
