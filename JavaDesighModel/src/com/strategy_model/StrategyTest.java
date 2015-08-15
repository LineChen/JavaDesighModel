package com.strategy_model;

/**
 * 
 * ����ģʽ��һ�ֶ�����һϵ���㷨�ķ������Ӹ����Ͻ���
 * ������Щ�㷨��ɵĶ�����ͬ�Ĺ�����ֻ��ʵ�ֲ�ͬ��
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
