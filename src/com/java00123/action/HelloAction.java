package com.java00123.action;

import com.opensymphony.xwork2.ActionSupport;

/**
* @author ���� www.java00123.com
* @version ����ʱ�䣺2018��4��24�� ����11:11:07
* ��˵��
*/
public class HelloAction extends ActionSupport{

	private String id;
	private String name;
	
	@Override
	public String execute() throws Exception {
		System.out.println("����HelloAction�ķ��ʣ�id:"+id);
		name = "java00123.com";
		return SUCCESS;
	}
	
	//����ֵ - ����
	public void setId(String id) {
		this.id = id;
	}
	
	//���� - ����
	public String getName() {
		return name;
	}
}
