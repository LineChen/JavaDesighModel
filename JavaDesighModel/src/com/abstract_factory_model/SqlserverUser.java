package com.abstract_factory_model;

/**
 * System.out.println("��User�����һ����¼");//
 * System.out.println("����Id�õ�User���е�һ����¼");
 */
public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("SqlserverUser : ��User�����һ����¼");
	}

	@Override
	public User getUser(String id) {
		System.out.println("SqlserverUser : ����Id�õ�User���е�һ����¼");
		return null;
	}

}
