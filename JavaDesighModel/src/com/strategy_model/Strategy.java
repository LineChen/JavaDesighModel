package com.strategy_model;

abstract class Strategy {
	//算法方法
	public abstract void AlgorythmInterface();
}

class ConcreteStrategyA extends Strategy{
	@Override
	public void AlgorythmInterface() {
		System.out.println("算法A实现");
	}
}

class ConcreteStrategyB extends Strategy{
	@Override
	public void AlgorythmInterface() {
		System.out.println("算法B实现");
	}
}

class ConcreteStrategyC extends Strategy{
	@Override
	public void AlgorythmInterface() {
		System.out.println("算法C实现");
	}
}












