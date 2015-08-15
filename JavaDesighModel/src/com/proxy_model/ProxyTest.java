package com.proxy_model;

/**
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问// 
 * 使用场合:1.远程代理 
 * 		  2.虚拟代理
 * 		  3.安全代理
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl("王美丽");

		Pursuit pursuit = new Pursuit("哒哒", girl);

		Proxy proxy = new Proxy(pursuit);

		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}

}
