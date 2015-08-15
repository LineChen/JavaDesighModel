package com.command_model;

/**
 * 命令模式：
 * 讲一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；
 * 对请求排队或记录请求日志,以及支持可撤销的操作
 * @author Administrator
 *
 */
public class CommandModelTest {
	public static void main(String[] args) {
		
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy ,"羊肉串");
		Command bakeChickenWingCommand = new BakeChickenWingCommand(boy, "鸡翅");
		
		Waiter girl = new Waiter();
		girl.setOrder(bakeMuttonCommand);
		girl.setOrder(bakeChickenWingCommand);
		girl.setOrder(new BakeChickenWingCommand(boy, "鸡翅"));
		girl.Notify();
		
		girl.displayOrder();
	}
}
