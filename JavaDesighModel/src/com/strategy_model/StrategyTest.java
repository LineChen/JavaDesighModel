package com.strategy_model;

/**
 * 
 * 策略模式：一种定义了一系列算法的方法，从概念上讲，
 * 所有这些算法完成的都是相同的工作，只是实现不同。
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		Context context;
		
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}

}
