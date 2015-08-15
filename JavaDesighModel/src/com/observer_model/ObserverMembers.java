package com.observer_model;

abstract class Observer{
	String name;
	Subject sub;
	
	
	public Observer(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}


	public abstract void update();
	
}




class StockObserver extends Observer{
	
	public StockObserver(String name, Subject secretary){
		super(name, secretary);
	}
	
	@Override
	public void update(){
		System.out.println(sub.getAction() + "," +  name + "��ֹͣ�鿴��Ʊ����������");
	}
}


class NBAObserver extends Observer{
	
	public NBAObserver(String name, Subject secretary){
		super(name, secretary);
	}
	
	@Override
	public void update(){
		System.out.println(sub.getAction() + "," +  name + "��ֹͣ�鿴NBA����������");
	}
}


















