package com.pxg.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @ProjectName��Job20190426
 * @ClassName: ContextUnit
 * @Description: TODO(������һ�仰��������������)
 * @author��ASUS����������
 * @date��2019��4��26������4:30:06
 */

public class ContextUtil {

	/**
	 * @Title: getByAnnotationObject
	 * @Description: TODO(ͨ��ע����)
	 * @param  @param annotation
	 * @param  @return   ����
	 * @return Object ��������
	 */
	public Object getByAnnotation(String annotation) {
		return getContext().getBean(annotation);
	}
	
	/**
	 * @Title: getByObject
	 * @Description: TODO(ͨ��������)
	 * @param  @param object
	 * @param  @return   ����
	 * @return Object ��������
	 */
	public Object getByObject(Object object) {
		return getContext().getBean(object.getClass());
	}
	
	/**
	 * @Title: getContext
	 * @Description: TODO(���context����)
	 * @param  @return   ����
	 * @return ClassPathXmlApplicationContext ��������
	 * ApplicationContext context = new ClassPathXmlApplicationContext();
	 */
	public ClassPathXmlApplicationContext getContext() {
		return new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
}
