package com.factory_model;

public class FactoryTest {

	public static void main(String[] args) {
		IFactory factory = new AddFactory();
		Operation operation = factory.createOperation();
		operation.setNumA(90);
		operation.setNumB(10);
		double result  = operation.getResult();
		System.out.println("result = " + result);
	}

}
