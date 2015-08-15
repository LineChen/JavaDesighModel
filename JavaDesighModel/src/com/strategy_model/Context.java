package com.strategy_model;

class Context {
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void ContextInterface(){
		strategy.AlgorythmInterface();
	}
}
