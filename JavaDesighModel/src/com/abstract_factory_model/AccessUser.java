package com.abstract_factory_model;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("AccessUser : 给User表插入一条记录");
	}

	@Override
	public User getUser(String id) {
		System.out.println("AccessUser : 根据Id得到User表中的一条记录");
		return null;
	}

}
