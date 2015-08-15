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
		System.out.println("前锋 ：" + name + " 进攻");
	}

	@Override
	public void defence() {
		System.out.println("前锋 ：" + name + " 防守");
	}

}

class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("中锋 ：" + name + " 进攻");
	}

	@Override
	public void defence() {
		System.out.println("中锋 ：" + name + " 防守");
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

	public void 进攻(){
		System.out.println("外籍中锋：" + name + " 进攻");
	}
	
	public void 防守(){
		System.out.println("外籍中锋：" + name + " 防守");
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
			foreignForward.进攻();
		}
	}

	@Override
	public void defence() {
		if(foreignForward != null){
			foreignForward.防守();
		}
	}
	
}












