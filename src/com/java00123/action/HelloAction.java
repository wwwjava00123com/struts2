package com.java00123.action;

import com.opensymphony.xwork2.ActionSupport;

/**
* @author 作者 www.java00123.com
* @version 创建时间：2018年4月24日 下午11:11:07
* 类说明
*/
public class HelloAction extends ActionSupport{

	private String id;
	private String name;
	
	@Override
	public String execute() throws Exception {
		System.out.println("这是HelloAction的访问！id:"+id);
		name = "java00123.com";
		return SUCCESS;
	}
	
	//设置值 - 传入
	public void setId(String id) {
		this.id = id;
	}
	
	//返回 - 传出
	public String getName() {
		return name;
	}
}
