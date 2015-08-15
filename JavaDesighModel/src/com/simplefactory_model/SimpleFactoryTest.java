package com.simplefactory_model;

public class SimpleFactoryTest {

	public static void main(String[] args) {

		Operation operation = OperationFactory.createOperation("*");
		operation.setNumA(10);
		operation.setNumB(2);
		double result = operation.getResult();
		System.out.println("result = " + result);
	}

}
