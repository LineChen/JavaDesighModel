package com.decorator_model;

/**
 * 装饰模式：动态的给一个对象添加一些额外的职责//
 * 优点：增加新的功能更加方便
 * 
 *
 */
public class DecratorTest {

	public static void main(String[] args) {
		Person p = new Person("loke");
		TShirts shirts = new TShirts();
		BigTrouser trouser = new BigTrouser();
		Sneakers sneakers = new Sneakers();

		
		/**show()方法的调用相当于一种递归*/
		shirts.decorate(p);
//		shirts.show();
		trouser.decorate(shirts);
//		trouser.show();
		sneakers.decorate(trouser);
		sneakers.show();
		
	}

}
