package com.java00123.action;

import com.opensymphony.xwork2.ActionSupport;

/**
* @author 作者 www.java00123.com
* @version 创建时间：2018年4月24日 下午11:16:37
* 类说明
*/
public class SutdentAction extends ActionSupport{

	public String student_add(){
		System.out.println("添加学生");
		return SUCCESS;
	}
	public String student_edit(){
		System.out.println("修改学生");
		return SUCCESS;
	}
	public String student_delete(){
		System.out.println("删除学生");
		return SUCCESS;
	}
	public String student_show(){
		System.out.println("查询学生");
		return SUCCESS;
	}
}
