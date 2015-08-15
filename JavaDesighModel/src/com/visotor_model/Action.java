package com.visotor_model;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.Delegate;
/**
 * 状态抽象类
 * @author Administrator
 *
 */
abstract class Action {
	public abstract void getManConclusion(Man man);

	public abstract void getWomanConclusion(Woman woman);
}

abstract class Person {
	// 接收
	public abstract void accept(Action visitor);
}

class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}

class Woman extends Person {
	
	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}

}

class Success extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(man.getClass().getSimpleName() + this.getClass().getSimpleName()
				+ "时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(woman.getClass().getSimpleName() + this.getClass().getSimpleName()
				+ "时，背后大多有一个不成功的女人");
	}

}


class Failing extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println(man.getClass().getSimpleName() + this.getClass().getSimpleName()
				+ "时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(woman.getClass().getSimpleName() + this.getClass().getSimpleName()
				+ "时，背后大多有一个不成功的女人");
	}

}

class ObjectStructure{
	List<Person> list = new ArrayList<Person>();
	
	public void attach(Person p){
		list.add(p);
	}
	
	public void detach(Person p){
		list.remove(p);
	}
	
	public void display(Action a){
		for (int i = 0; i < list.size(); i++) {
			list.get(i).accept(a);
		}
	}
}



















