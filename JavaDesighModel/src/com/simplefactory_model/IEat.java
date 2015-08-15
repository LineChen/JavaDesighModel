package com.simplefactory_model;

public interface IEat {
	void eat();
}

class Duck implements IEat {
	@Override
	public void eat() {
		System.out.println("øæ—º");
	}
}

class Chicken implements IEat {
	@Override
	public void eat() {
		System.out.println("’®º¶");
	}
}

class Fish implements IEat {
	@Override
	public void eat() {
		System.out.println("”„∆¨");
	}
}
