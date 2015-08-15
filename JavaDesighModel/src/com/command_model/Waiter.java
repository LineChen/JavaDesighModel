package com.command_model;

import java.util.ArrayList;
import java.util.List;

/**
 * ����Ա����¼����
 * @author Administrator
 *
 */
class Waiter {
	private List<Command> list = new ArrayList<Command>();
	
	
	public void setOrder(Command command){
		list.add(command);
	}
	
	public void cancelOrder(Command command){
		list.remove(command);
	}
	
	
	
	public void Notify(){
		for(int i = 0; i < list.size(); i++){
			list.get(i).executeCommand();
		}
	}
	
	/**
	 * ��ӡ�˵�
	 */
	public void displayOrder(){
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
}
