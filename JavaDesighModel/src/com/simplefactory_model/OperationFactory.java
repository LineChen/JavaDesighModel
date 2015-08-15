package com.simplefactory_model;

/*
 * 
 * 简单工厂模式: 优点：实现简单，扩展方便 
 *  缺点：违法开放-封闭原则，，扩展时需要在所有逻辑里修改，，
 *
 */
public class OperationFactory {

	public static Operation createOperation(String oper) {
		Operation operation = null;

		switch (oper) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;
		}
		return operation;
	}
}
