package com.strategy_model;

abstract class Strategy {
	//�㷨����
	public abstract void AlgorythmInterface();
}

class ConcreteStrategyA extends Strategy{
	@Override
	public void AlgorythmInterface() {
		System.out.println("�㷨Aʵ��");
	}
}

class ConcreteStrategyB extends Strategy{
	@Override
	public void AlgorythmInterface() {
		System.out.println("�㷨Bʵ��");
	}
}

class ConcreteStrategyC extends Strategy{
	@Override
	public void AlgorythmInterface() {
		System.out.println("�㷨Cʵ��");
	}
}












