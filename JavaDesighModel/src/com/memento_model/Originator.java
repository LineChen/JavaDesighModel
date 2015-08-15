package com.memento_model;

/**
 * 备忘录发起者
 * @author Administrator
 *
 */
class Originator {
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void returnToBefore(Memento memento){
		state = memento.getState();
	}
	
	public void show(){
		System.out.println("state:" + state);
	}
}

/**
 * 备忘录:记录需要记下的一些属性值
 * @author Administrator
 *
 */
class Memento{
	private String state;
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
}


/**
 * 备忘录管理类 (保存或取出一份备忘录)
 * @author Administrator
 *
 */
class CareTaker{
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}

























