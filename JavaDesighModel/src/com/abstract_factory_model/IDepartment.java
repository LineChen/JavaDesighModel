package com.abstract_factory_model;

public interface IDepartment {
	void insert(Department department);
	
	User getDepartment(String id);
}
