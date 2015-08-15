package com.adapter_model;

abstract class Player {
	String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract void attack();

	public abstract void defence();
}

class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ǰ�� ��" + name + " ����");
	}

	@Override
	public void defence() {
		System.out.println("ǰ�� ��" + name + " ����");
	}

}

class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("�з� ��" + name + " ����");
	}

	@Override
	public void defence() {
		System.out.println("�з� ��" + name + " ����");
	}

}


class ForeignForward{
	private String name;
	
	
//	public ForeignForward(String name){
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void ����(){
		System.out.println("�⼮�з棺" + name + " ����");
	}
	
	public void ����(){
		System.out.println("�⼮�з棺" + name + " ����");
	}
}

class Translator extends Player{
	ForeignForward foreignForward = new ForeignForward();

	public Translator(String name) {
		super(name);
		foreignForward.setName(name);
	}

	@Override
	public void attack() {
		if(foreignForward != null){
			foreignForward.����();
		}
	}

	@Override
	public void defence() {
		if(foreignForward != null){
			foreignForward.����();
		}
	}
	
}












