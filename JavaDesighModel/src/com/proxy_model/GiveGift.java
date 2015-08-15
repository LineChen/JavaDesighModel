package com.proxy_model;

interface GiveGift {
	void giveDolls();

	void giveFlowers();

	void giveChocolate();
}


class Pursuit implements GiveGift{

	String name;
	SchoolGirl girl;
	
	public Pursuit(String name, SchoolGirl girl){
		this.name = name;
		this.girl = girl;
	}
		
	
	@Override
	public void giveDolls() {
		System.out.println(girl.getName() + "," + name + " ����������");
	}

	@Override
	public void giveFlowers() {
		System.out.println(girl.getName() + "," + name + " ���㻨");
	}

	@Override
	public void giveChocolate() {
		System.out.println(girl.getName() + "," + name + " �������ɿ���");
	}
}



class Proxy implements GiveGift{
	Pursuit pursuit;
	
	public Proxy(Pursuit pursuit){
		this.pursuit = pursuit;
	}
	
	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}
	
}








