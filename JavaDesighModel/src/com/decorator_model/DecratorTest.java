package com.decorator_model;

/**
 * װ��ģʽ����̬�ĸ�һ���������һЩ�����ְ��//
 * �ŵ㣺�����µĹ��ܸ��ӷ���
 * 
 *
 */
public class DecratorTest {

	public static void main(String[] args) {
		Person p = new Person("loke");
		TShirts shirts = new TShirts();
		BigTrouser trouser = new BigTrouser();
		Sneakers sneakers = new Sneakers();

		
		/**show()�����ĵ����൱��һ�ֵݹ�*/
		shirts.decorate(p);
//		shirts.show();
		trouser.decorate(shirts);
//		trouser.show();
		sneakers.decorate(trouser);
		sneakers.show();
		
	}

}
