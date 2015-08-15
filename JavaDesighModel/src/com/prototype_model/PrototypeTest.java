package com.prototype_model;

/**
 * 原型模式：用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * 注意浅复制和深复制的区别:
 * 浅复制：被复制的所有变量都含有与原来对象相同的值，而所有的对其他对象的引用都依然指向原来的对象
 * 深复制：把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象.
 *
 */
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("大刘");
		resume.setPersonInfo("男", "22");
		resume.setWorkExperience("2015.8.3-2015.12.11", "千锋");
		
		Resume resume2 = (Resume) resume.clone();
		resume2.setPersonInfo("male", "19");
		resume2.setWorkExperience("2015.10.1-1.15.12.22", "百度");
		
		resume.display();
		resume2.display();
				
	}

}
