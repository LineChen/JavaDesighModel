package com.mediator_model;

/**
 * 中介者模式: 用一个中介对象来封装一系列的对象系列，中介者使各对象不需要 显式地互相调用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 * 
 * 优点： Mediator的出现减少了各个Colleague的耦合
 * ，使得可以独立地改变和复用各个Colleague类和Mediator，由于把对象如何协作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中，
 * 这样关注的对象就从对象各自本身的行为转移到它们之间的交互上来，也就是站在一个更宏观的角度看待系统
 * 
 * 缺点：由于ConcreteMediator控制集中化，于是就把交互复杂性变为了中介者的复杂性
 * ，这就使得中介者会变得比任何一个ConcreteColleague都复杂
 * 
 * 应用场合:一般应用于一组对象以定义良好但是复杂的方式进行通信的场合，以及想定制一个分布在多个类中的行为，而又不想生成太多的子类的场合
 */
public class MediatorModelTest {

	public static void main(String[] args) {
		ConcretMediator mediator = new ConcretMediator();

		Colleague clg1 = new ConcreteColleague1(mediator);
		Colleague clg2 = new ConcreteColleague2(mediator);

		mediator.setClg1(clg1);
		mediator.setClg2(clg2);

		clg1.send("饿不饿?");
		clg2.send("不饿");
	}

}
