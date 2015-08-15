package com.oberver_entrust;

class Observer {
	String name;
	Subject subject;

	public Observer(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}

class StockObserver extends Observer{

	public StockObserver(String name, Subject secretary) {
		super(name, secretary);
	}
	
	public void closeStock(){
		System.out.println(name + ":ֹͣ�鿴��Ʊ����������");
	}
}

class NBAObserver extends Observer{

	SubjectListener listener;
	
	public void setSubListener(SubjectListener listener){
		listener.subListen();
	}
	
	public NBAObserver(String name, Subject secretary) {
		super(name, secretary);
	}
	
	public void closeNBA(){
		System.out.println(name + ":ֹͣ��NBA����������");
	}

}



















