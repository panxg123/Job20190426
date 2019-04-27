package com.pxg.service;

import com.pxg.model.Post0426Model;
import com.pxg.model.Postbbs0426Model;

/** @ProjectName：Job20190426
 * @ClassName: PostBbsService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午10:30:14
 */

public interface PostBbsService {

	/**
	 * @Title: insertPostbbs
	 * @Description: TODO(新增一个回帖)
	 * @param  @param postbbs0426Dao
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public int insertPostbbs(Postbbs0426Model postbbs0426Model,Integer index);
	
	/**
	 * @Title: insertPost
	 * @Description: TODO(新增一个帖子)
	 * @param  @param post0426Model
	 * @param  @return   参数
	 * @return int 返回类型
	 */
	public int insertPost(Post0426Model post0426Model);
}
