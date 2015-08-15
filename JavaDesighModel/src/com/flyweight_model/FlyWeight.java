package com.flyweight_model;

import java.util.Hashtable;

/**
 * ��Ԫ������
 * @author Administrator
 *
 */
abstract class Flyweight {
	public abstract void operation(int state);
}

/**
 * ������Ԫ��
 * @author Administrator
 *
 */
class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int state) {
		System.out.println("������Ԫ" + state);
	}
	
}

/**
 * ������ľ�����Ԫ��
 * @author Administrator
 *
 */
class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int state) {
		System.out.println("�����������Ԫ:" + state);
	}
	
}


class FlyweightFactory{
	private Hashtable<String, Flyweight> flyweights = new Hashtable<>();
	
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());//X������Ԫ����
		flyweights.put("Y", new ConcreteFlyweight());//...
		flyweights.put("Z", new ConcreteFlyweight());//...
	}
	
	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}
}


























