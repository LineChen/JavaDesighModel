package com.templet_model;

/**
 * 模板模式:定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 *
 */
public class TempletModel {

	public static void main(String[] args) {
		SuperMan spiderMan = new SpiderMan();
		SuperMan ironMan = new IronMan();

		spiderMan.saveWorld();
		ironMan.saveWorld();

	}

}

abstract class SuperMan {

	public void saveWorld() {
		save();
		overCome();
	}

	abstract public void save();

	abstract public void overCome();

}

class SpiderMan extends SuperMan {
	
	@Override
	public void save() {
		System.out.println("我是蜘蛛侠，我在拯救世界");
	}

	@Override
	public void overCome() {
		System.out.println("我是蜘蛛侠，我把世界拯救了");
	}

}

class IronMan extends SuperMan {

	@Override
	public void save() {
		System.out.println("我是钢铁侠，我在拯救世界");
	}

	@Override
	public void overCome() {
		System.out.println("我是钢铁侠，我把世界拯救了");
	}

}
