package com.abstract_factory_model;

/**
 * System.out.println("给User表插入一条记录");//
 * System.out.println("根据Id得到User表中的一条记录");
 */
public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("SqlserverUser : 给User表插入一条记录");
	}

	@Override
	public User getUser(String id) {
		System.out.println("SqlserverUser : 根据Id得到User表中的一条记录");
		return null;
	}

}
