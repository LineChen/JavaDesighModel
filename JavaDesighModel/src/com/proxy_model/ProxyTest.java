package com.proxy_model;

/**
 * ����ģʽ��Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���// 
 * ʹ�ó���:1.Զ�̴��� 
 * 		  2.�������
 * 		  3.��ȫ����
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl("������");

		Pursuit pursuit = new Pursuit("����", girl);

		Proxy proxy = new Proxy(pursuit);

		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}

}
