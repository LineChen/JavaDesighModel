package com.simplefactory_model;

/**
 * 
 * �򵥹���ģʽ:
 * �ŵ㣺ʵ�ּ򵥣���չ����
 * ȱ�㣺Υ������-���ԭ�򣬣���չʱ��Ҫ�������߼����޸ģ���
 *
 */
public class TestFactory {

	public static void main(String[] args) {
		Cook(1).eat();;
	}

	public static IEat Cook(int choose) {
		IEat iEat = null;
		switch (choose) {
		case 1:
			iEat = new Duck();
			break;
		case 2:
			iEat = new Chicken();
			break;
		case 3:
			iEat = new Fish();
			break;
		case 4:
			iEat = new Fish();
			break;
		}
		return iEat;
	}

}
