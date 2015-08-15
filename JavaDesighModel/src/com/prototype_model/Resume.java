package com.prototype_model;


class WorkExperience implements Cloneable{
	String timeArea;
	String company;
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		WorkExperience w = new WorkExperience();
		w.setTimeArea(this.timeArea);
		w.setCompany(this.company);
		return w;
	}
	
}





class Resume {
	String name;
	String sex;
	String age;
	
	WorkExperience workExperience;
	
	public Resume(String name){
		this.name = name;
		workExperience = new WorkExperience();
	}
	
	public void setPersonInfo(String sex, String age){
		this.sex = sex;
		this.age =age;
	}
	
	public void setWorkExperience(String timeArea, String company){
		workExperience.timeArea = timeArea;
		workExperience.company = company;
	}

	public void display(){
		System.out.println("姓名：" + name + ", 性别：" + sex + ", 年龄：" + age);
		System.out.println("工作经历:" + workExperience.timeArea + "," + workExperience.company);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume = new Resume(this.name);
		resume.setPersonInfo(this.sex, this.age);
		resume.setWorkExperience(this.workExperience.timeArea, this.workExperience.company);
		return resume;
	}
	
	
	
	
	
}






















