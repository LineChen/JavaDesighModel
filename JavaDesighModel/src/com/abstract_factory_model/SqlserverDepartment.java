package com.abstract_factory_model;

class SqlserverDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("SqlserverDepartment : ����һ����¼��Department����");
	}

	@Override
	public User getDepartment(String id) {
		System.out.println("SqlserverDepartment : ����Id��Department���еõ�һ����¼");
		return null;
	}

}
