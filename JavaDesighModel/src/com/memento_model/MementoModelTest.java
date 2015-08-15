package com.memento_model;

/**
 * ����¼ģʽ���ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬
 * �����Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬�� 
 *
 *	ע�⣺�������״̬̫��ʱ��ռ�ڴ�Ƚϴ�
 */
public class MementoModelTest {

	public static void main(String[] args) {
		
		/* ģ��ģʽ���ԣ�
		 * Originator originator = new Originator();
		originator.setState("On...");
		originator.show();
		
		CareTaker careTaker = new CareTaker();
		//����
		careTaker.saveMemento(originator.createMemento());
		
		originator.setState("Off...");
		originator.show();
		
		//��ԭ
		originator.returnToBefore(careTaker.getMemento());
		originator.show();*/
		
		
		GameRole gameRole = new GameRole();
		gameRole.setName("����");
		gameRole.setLifeVal(100);
		gameRole.setDefenceVal(87);
		gameRole.setAttackVal(95);
		System.out.println("��սǰ��״̬��");
		gameRole.show();
		
		GameCareTaker careTaker = new GameCareTaker(gameRole.createGameMemento());
		gameRole.setLifeVal(60);
		gameRole.setDefenceVal(80);
		gameRole.setAttackVal(92);
		System.out.println("ս����Ѫ��");
		gameRole.show();
		
		gameRole.returnToBefore(careTaker.getGameMemento());
		System.out.println("��Ѫ��ԭ��");
		gameRole.show();
		
		
	}

}
