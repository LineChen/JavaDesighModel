package com.facade_model;

class Facade {
	SubSystem1 system1;
	SubSystem2 system2;
	SubSystem3 system3;
	
	public Facade(){
		system1 = new SubSystem1();
		system2 = new SubSystem2();
		system3 = new SubSystem3();
	}
	
	
	//不同子系统方法的组合
	
	public void method1(){
		System.out.println("方法1");
		system1.methodeA();
		system2.methodeB();
		system3.methodeC();
	}
	
	
	public void method2(){
		System.out.println("方法2");
		system2.methodeB();
		system3.methodeC();
	}
	
	//...
	
}




