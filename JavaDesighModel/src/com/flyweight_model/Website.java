package com.flyweight_model;

import java.util.Hashtable;

/**
 * ��������ʹ����Ԫģʽ
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


//��վ������
abstract class Website {
	public abstract void use(User user);
}

//������վ��
class ConcreteWebsite extends Website{

	private String name;
	
	public ConcreteWebsite(String name){
		this.name = name;
	}
	
	@Override
	public void use(User user) {
		System.out.println("��վ����:" + name + " ʹ����:" + user.getName());
	}
	
}

//��վ������
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









