package com.flyweight_model;

import java.util.Hashtable;

/**
 * 具体问题使用享元模式
 *
 */

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


//网站抽象类
abstract class Website {
	public abstract void use(User user);
}

//具体网站类
class ConcreteWebsite extends Website{

	private String name;
	
	public ConcreteWebsite(String name){
		this.name = name;
	}
	
	@Override
	public void use(User user) {
		System.out.println("网站类型:" + name + " 使用者:" + user.getName());
	}
	
}

//网站工厂类
class WebsiteFactory{
	private Hashtable<String, Website> webs = new Hashtable<String, Website>();
	
	public Website getWebsite(String key){
		if(!webs.containsKey(key))
			webs.put(key, new ConcreteWebsite(key));
		return webs.get(key);
	}
	
	public int getWebCount(){
		return webs.size();
	}
	
	
}









