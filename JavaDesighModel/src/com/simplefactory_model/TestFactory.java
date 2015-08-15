package com.simplefactory_model;

/**
 * 
 * 简单工厂模式:
 * 优点：实现简单，扩展方便
 * 缺点：违法开放-封闭原则，，扩展时需要在所有逻辑里修改，，
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
