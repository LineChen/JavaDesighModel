package com.abstract_factory_model;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("AccessUser : ��User�����һ����¼");
	}

	@Override
	public User getUser(String id) {
		System.out.println("AccessUser : ����Id�õ�User���е�һ����¼");
		return null;
	}

}
