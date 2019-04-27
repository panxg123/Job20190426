package com.pxg.test;

import org.junit.Test;

import com.pxg.model.Post0426Model;
import com.pxg.model.Postbbs0426Model;
import com.pxg.service.PostBbsService;
import com.pxg.util.ContextUtil;

/** @ProjectName：Job20190426
 * @ClassName: PostTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午10:42:56
 */

public class PostTest extends ContextUtil{
	
	private PostBbsService pbs = (PostBbsService) getByAnnotation("PostBbsServiceImpl");
	
	/**
	 * @Title: insertPost
	 * @Description: TODO(发新帖)
	 * @param     参数
	 * @return void 返回类型
	 */
	@Test
	public void insertPost() {
		Post0426Model post0426Model = new Post0426Model();
		post0426Model.setCONTENTID("第一次发帖,我是用户6");
		post0426Model.setUSERID(6);
		System.out.println(pbs.insertPost(post0426Model));
	}
	
	/**
	 * @Title: insertPostbbs
	 * @Description: TODO(回帖)
	 * @param     参数
	 * @return void 返回类型
	 */
	@Test
	public void insertPostbbs() {
		Postbbs0426Model pModel = new Postbbs0426Model();
		pModel.setPOSTID(9);
		pModel.setSENDID(6);
		pModel.setREPLYID(7);
		pModel.setCONTENTID("发帖人7回复回帖人6");
		//2为回帖人回复/1为发帖人回复
		System.out.println(pbs.insertPostbbs(pModel, 1));
	}

}
























