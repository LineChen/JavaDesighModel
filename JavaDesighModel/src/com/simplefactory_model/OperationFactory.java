package com.simplefactory_model;

/*
 * 
 * �򵥹���ģʽ: �ŵ㣺ʵ�ּ򵥣���չ���� 
 *  ȱ�㣺Υ������-���ԭ�򣬣���չʱ��Ҫ�������߼����޸ģ���
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
