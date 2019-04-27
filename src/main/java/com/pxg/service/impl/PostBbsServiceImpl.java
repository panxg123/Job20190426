package com.pxg.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxg.dao.Post0426Dao;
import com.pxg.dao.Postbbs0426Dao;
import com.pxg.dao.User0426Dao;
import com.pxg.model.Post0426Model;
import com.pxg.model.Postbbs0426Model;
import com.pxg.service.PostBbsService;

/**
 * @ProjectName：Job20190426
 * @ClassName: PostBbsServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生） @date：2019年4月26日下午10:31:16
 */
@Service(value = "PostBbsServiceImpl")
public class PostBbsServiceImpl implements PostBbsService {

	@Autowired
	private User0426Dao user0426Dao;
	@Autowired
	private Postbbs0426Dao postbbs0426Dao;
	@Autowired
	private Post0426Dao post0426Dao;

	public void setUser0426Dao(User0426Dao user0426Dao) {
		this.user0426Dao = user0426Dao;
	}

	public void setPostbbs0426Dao(Postbbs0426Dao postbbs0426Dao) {
		this.postbbs0426Dao = postbbs0426Dao;
	}

	public void setPost0426Dao(Post0426Dao post0426Dao) {
		this.post0426Dao = post0426Dao;
	}

	/**
	 * (非 Javadoc)
	 * 
	 * @param postbbs0426Model
	 * @return
	 * @see com.pxg.service.PostBbsService#insertPostbbs(com.pxg.model.Postbbs0426Model)
	 */

	@Override
	public int insertPostbbs(Postbbs0426Model postbbs0426Model,Integer index) {
		try {
			//新增回帖
			postbbs0426Dao.insertPostbbs(postbbs0426Model);
			//修改积分
			Map<String, Object> map = new HashMap<String, Object>();
			//为2表示回帖
			map.put("statu", 2);
			if (index==1) {
				//发帖人回复
				map.put("id", postbbs0426Model.getSENDID());
			} else {
				//回帖人回复
				map.put("id", postbbs0426Model.getREPLYID());
			}
			//调用修改积分方法
			user0426Dao.updateUser(map);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * (非 Javadoc)
	 * 
	 * @param post0426Model
	 * @return
	 * @see com.pxg.service.PostBbsService#insertPost(com.pxg.model.Post0426Model)
	 */

	@Override
	public int insertPost(Post0426Model post0426Model) {
		try {
			//调用新增发帖
			post0426Dao.insertPost(post0426Model);
			Map<String, Object> map = new HashMap<String, Object>();
			//为1表示发帖
			map.put("statu", 1);
			map.put("id", post0426Model.getUSERID());
			//调用修改积分
			user0426Dao.updateUser(map);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
