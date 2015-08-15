package com.mediator_model;

/**
 * �н���ģʽ: ��һ���н��������װһϵ�еĶ���ϵ�У��н���ʹ��������Ҫ ��ʽ�ػ�����ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ���
 * 
 * �ŵ㣺 Mediator�ĳ��ּ����˸���Colleague�����
 * ��ʹ�ÿ��Զ����ظı�͸��ø���Colleague���Mediator�����ڰѶ������Э�������˳��󣬽��н���Ϊһ�������ĸ�������װ��һ�������У�
 * ������ע�Ķ���ʹӶ�����Ա������Ϊת�Ƶ�����֮��Ľ���������Ҳ����վ��һ������۵ĽǶȿ���ϵͳ
 * 
 * ȱ�㣺����ConcreteMediator���Ƽ��л������ǾͰѽ��������Ա�Ϊ���н��ߵĸ�����
 * �����ʹ���н��߻��ñ��κ�һ��ConcreteColleague������
 * 
 * Ӧ�ó���:һ��Ӧ����һ������Զ������õ��Ǹ��ӵķ�ʽ����ͨ�ŵĳ��ϣ��Լ��붨��һ���ֲ��ڶ�����е���Ϊ�����ֲ�������̫�������ĳ���
 */
public class MediatorModelTest {

	public static void main(String[] args) {
		ConcretMediator mediator = new ConcretMediator();

		Colleague clg1 = new ConcreteColleague1(mediator);
		Colleague clg2 = new ConcreteColleague2(mediator);

		mediator.setClg1(clg1);
		mediator.setClg2(clg2);

		clg1.send("������?");
		clg2.send("����");
	}

}
