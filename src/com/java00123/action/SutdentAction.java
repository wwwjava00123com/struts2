package com.java00123.action;

import com.opensymphony.xwork2.ActionSupport;

/**
* @author ���� www.java00123.com
* @version ����ʱ�䣺2018��4��24�� ����11:16:37
* ��˵��
*/
public class SutdentAction extends ActionSupport{

	public String student_add(){
		System.out.println("���ѧ��");
		return SUCCESS;
	}
	public String student_edit(){
		System.out.println("�޸�ѧ��");
		return SUCCESS;
	}
	public String student_delete(){
		System.out.println("ɾ��ѧ��");
		return SUCCESS;
	}
	public String student_show(){
		System.out.println("��ѯѧ��");
		return SUCCESS;
	}
}
