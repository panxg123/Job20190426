package com.pxg.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @ProjectName：Job20190426
 * @ClassName: ContextUnit
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author：ASUS（潘先生）
 * @date：2019年4月26日下午4:30:06
 */

public class ContextUtil {

	/**
	 * @Title: getByAnnotationObject
	 * @Description: TODO(通过注解获得)
	 * @param  @param annotation
	 * @param  @return   参数
	 * @return Object 返回类型
	 */
	public Object getByAnnotation(String annotation) {
		return getContext().getBean(annotation);
	}
	
	/**
	 * @Title: getByObject
	 * @Description: TODO(通过对象获得)
	 * @param  @param object
	 * @param  @return   参数
	 * @return Object 返回类型
	 */
	public Object getByObject(Object object) {
		return getContext().getBean(object.getClass());
	}
	
	/**
	 * @Title: getContext
	 * @Description: TODO(获得context对象)
	 * @param  @return   参数
	 * @return ClassPathXmlApplicationContext 返回类型
	 * ApplicationContext context = new ClassPathXmlApplicationContext();
	 */
	public ClassPathXmlApplicationContext getContext() {
		return new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
}
