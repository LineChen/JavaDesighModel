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
		System.out.println(sub.getAction() + "," +  name + "：停止查看股票，继续工作");
	}
}


class NBAObserver extends Observer{
	
	public NBAObserver(String name, Subject secretary){
		super(name, secretary);
	}
	
	@Override
	public void update(){
		System.out.println(sub.getAction() + "," +  name + "：停止查看NBA，继续工作");
	}
}


















