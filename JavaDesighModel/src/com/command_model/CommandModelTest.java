package com.command_model;

/**
 * ����ģʽ��
 * ��һ�������װΪһ�����󣬴Ӷ�ʹ����ò�ͬ������Կͻ����в�������
 * �������Ŷӻ��¼������־,�Լ�֧�ֿɳ����Ĳ���
 * @author Administrator
 *
 */
public class CommandModelTest {
	public static void main(String[] args) {
		
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand = new BakeMuttonCommand(boy ,"���⴮");
		Command bakeChickenWingCommand = new BakeChickenWingCommand(boy, "����");
		
		Waiter girl = new Waiter();
		girl.setOrder(bakeMuttonCommand);
		girl.setOrder(bakeChickenWingCommand);
		girl.setOrder(new BakeChickenWingCommand(boy, "����"));
		girl.Notify();
		
		girl.displayOrder();
	}
}
