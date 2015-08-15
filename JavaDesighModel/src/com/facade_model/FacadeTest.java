package com.facade_model;

/**
 *
 * 外观模式：为子系统中的一组接口提供一个一直的界面，
 * 
 * 此模式定义了一个高层接口，这接口使得这一子系统更加容易使用
 * 
 */
public class FacadeTest {

	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.method1();
		
		facade.method2();
	}

}
