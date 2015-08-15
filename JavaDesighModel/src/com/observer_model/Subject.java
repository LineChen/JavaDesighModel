package com.observer_model;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
	List<Observer> list = new ArrayList<Observer>();
	String action;

	public abstract void attach(Observer observer);

	public abstract void detach(Observer observer);

	public abstract void Notify();

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

}

class Secretary extends Subject {

	@Override
	public void attach(Observer observer) {
		list.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void Notify() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).update();
		}
	}
	
}

class Boss extends Subject {

	@Override
	public void attach(Observer observer) {
		list.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void Notify() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).update();
		}
	}
}
