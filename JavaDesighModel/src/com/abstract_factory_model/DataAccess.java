package com.abstract_factory_model;

public class DataAccess {
	private static final String  db = "Sqlserver";
	//private static final String  db = "Access";
	
	
	public static IUser CreateUser(){
		IUser result = null;
		switch (db) {
		case "Sqlserver":
			result = new SqlserverUser();
			break;
			
		case "Access":
			result = new AccessUser();
			break;	
		}
		
		return result;
	}
	
	public static IDepartment CreateDepartment(){
		IDepartment result = null;
		switch (db) {
		case "Sqlserver":
			result = new SqlserverDepartment();
			break;
			
		case "Access":
			result = new AccessDepartment();
			break;	
		}
		
		return result;
	}
	
	
}
