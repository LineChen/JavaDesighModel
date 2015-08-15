package com.observer_model;

/**
 * 观察者模式：定义了一种一对多的依赖关系，
 * 	让多个观察者对象同时监听一个Subject对象（被观察者）。这个被观察者对象在发生状态改变时
 * 会通知多有观察该被观察者的对象，使他们能够自动更新自己
 * 
 * @author Administrator
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
//		Subject secretary = new Secretary();
		Subject boss = new Boss();
		
		StockObserver s1 = new StockObserver("Tiger", boss);
		StockObserver s2 = new StockObserver("Green", boss);
		NBAObserver n1 = new NBAObserver("Bitch", boss);
		
		boss.attach(s1);
		boss.attach(s2);
		boss.attach(n1);
		
		boss.detach(n1);
		
		
		
		boss.setAction("大boss回来了");
		boss.Notify();
	}

}
