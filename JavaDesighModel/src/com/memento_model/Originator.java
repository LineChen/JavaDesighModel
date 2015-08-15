package com.memento_model;

/**
 * ����¼������
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
 * ����¼:��¼��Ҫ���µ�һЩ����ֵ
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
 * ����¼������ (�����ȡ��һ�ݱ���¼)
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

























