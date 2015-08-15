package com.simplefactory_model;

public interface IEat {
	void eat();
}

class Duck implements IEat {
	@Override
	public void eat() {
		System.out.println("��Ѽ");
	}
}

class Chicken implements IEat {
	@Override
	public void eat() {
		System.out.println("ը��");
	}
}

class Fish implements IEat {
	@Override
	public void eat() {
		System.out.println("��Ƭ");
	}
}
