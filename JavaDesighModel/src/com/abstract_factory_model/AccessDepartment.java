package com.abstract_factory_model;

class AccessDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("AccessDepartment : ����һ����¼��Department����");
	}

	@Override
	public User getDepartment(String id) {
		System.out.println("AccessDepartment : ����Id��Department���еõ�һ����¼");
		return null;
	}

}
