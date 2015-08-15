package com.flyweight_model;

import java.util.Hashtable;

/**
 * 享元抽象类
 * @author Administrator
 *
 */
abstract class Flyweight {
	public abstract void operation(int state);
}

/**
 * 具体享元类
 * @author Administrator
 *
 */
class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int state) {
		System.out.println("具体享元" + state);
	}
	
}

/**
 * 不共享的具体享元类
 * @author Administrator
 *
 */
class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int state) {
		System.out.println("不共享具体享元:" + state);
	}
	
}


class FlyweightFactory{
	private Hashtable<String, Flyweight> flyweights = new Hashtable<>();
	
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());//X类型享元对象
		flyweights.put("Y", new ConcreteFlyweight());//...
		flyweights.put("Z", new ConcreteFlyweight());//...
	}
	
	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}


























