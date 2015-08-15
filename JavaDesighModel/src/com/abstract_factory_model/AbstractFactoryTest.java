package com.abstract_factory_model;

/**
 *抽象工厂模式：
 *
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		User user = new User();
		Department department = new Department();
		
		IUser iUser = DataAccess.CreateUser();
		iUser.insert(user);
		
		IDepartment iDepartment = DataAccess.CreateDepartment();
		iDepartment.insert(department);
	}

}
