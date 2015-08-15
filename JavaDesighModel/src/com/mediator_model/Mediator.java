package com.mediator_model;

/**
 * 抽象中介类
 * @author Administrator
 *
 */
abstract class Mediator {
	public abstract void seng(String msg, Colleague clg);
}

/**
 * 具体中介类
 * @author Administrator
 *
 */
class ConcretMediator extends Mediator{

	private Colleague clg1;//对象1
	private Colleague clg2;//对象二
	
	public Colleague getClg1() {
		return clg1;
	}

	public void setClg1(Colleague clg1) {
		this.clg1 = clg1;
	}

	public Colleague getClg2() {
		return clg2;
	}

	public void setClg2(Colleague clg2) {
		this.clg2 = clg2;
	}

	@Override
	public void seng(String msg, Colleague clg) {
		if(clg == clg1){
			clg2.getMsg(msg);
		} else {
			clg1.getMsg(msg);
		}
	}	
}

/**
 * 抽象同事类
 * @author Administrator
 *
 */
abstract class Colleague{
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void getMsg(String msg);
	
	public abstract void send(String msg);
}

/**
 * 具体同事类1
 * @author Administrator
 *
 */
class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String msg){
		mediator.seng(msg, this);
	}

	
	public void getMsg(String msg){
		System.out.println("ConcreteColleague1 得到消息:" + msg);
	}
}

/**
 * 具体同事类1
 * @author Administrator
 *
 */
class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String msg){
		mediator.seng(msg, this);
	}

	
	public void getMsg(String msg){
		System.out.println("ConcreteColleague2 得到消息:" + msg);
	}
}




