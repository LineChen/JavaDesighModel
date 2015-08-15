package com.abstract_factory_model;

interface IUser {
	void insert(User user);
	
	User getUser(String id);
}
