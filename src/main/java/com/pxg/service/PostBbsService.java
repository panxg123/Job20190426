package com.pxg.service;

import com.pxg.model.Post0426Model;
import com.pxg.model.Postbbs0426Model;

/** @ProjectName��Job20190426
 * @ClassName: PostBbsService
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������10:30:14
 */

public interface PostBbsService {

	/**
	 * @Title: insertPostbbs
	 * @Description: TODO(����һ������)
	 * @param  @param postbbs0426Dao
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int insertPostbbs(Postbbs0426Model postbbs0426Model,Integer index);
	
	/**
	 * @Title: insertPost
	 * @Description: TODO(����һ������)
	 * @param  @param post0426Model
	 * @param  @return   ����
	 * @return int ��������
	 */
	public int insertPost(Post0426Model post0426Model);
}
