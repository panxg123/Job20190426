package com.pxg.test;

import org.junit.Test;

import com.pxg.model.Post0426Model;
import com.pxg.model.Postbbs0426Model;
import com.pxg.service.PostBbsService;
import com.pxg.util.ContextUtil;

/** @ProjectName��Job20190426
 * @ClassName: PostTest
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������10:42:56
 */

public class PostTest extends ContextUtil{
	
	private PostBbsService pbs = (PostBbsService) getByAnnotation("PostBbsServiceImpl");
	
	/**
	 * @Title: insertPost
	 * @Description: TODO(������)
	 * @param     ����
	 * @return void ��������
	 */
	@Test
	public void insertPost() {
		Post0426Model post0426Model = new Post0426Model();
		post0426Model.setCONTENTID("��һ�η���,�����û�6");
		post0426Model.setUSERID(6);
		System.out.println(pbs.insertPost(post0426Model));
	}
	
	/**
	 * @Title: insertPostbbs
	 * @Description: TODO(����)
	 * @param     ����
	 * @return void ��������
	 */
	@Test
	public void insertPostbbs() {
		Postbbs0426Model pModel = new Postbbs0426Model();
		pModel.setPOSTID(9);
		pModel.setSENDID(6);
		pModel.setREPLYID(7);
		pModel.setCONTENTID("������7�ظ�������6");
		//2Ϊ�����˻ظ�/1Ϊ�����˻ظ�
		System.out.println(pbs.insertPostbbs(pModel, 1));
	}

}
























