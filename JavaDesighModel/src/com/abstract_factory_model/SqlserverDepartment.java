package com.abstract_factory_model;

class SqlserverDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("SqlserverDepartment : 插入一条记录到Department表中");
	}

	@Override
	public User getDepartment(String id) {
		System.out.println("SqlserverDepartment : 根据Id在Department表中得到一条记录");
		return null;
	}

}
