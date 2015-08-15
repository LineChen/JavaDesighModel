package com.memento_model;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
 * 这样以后就可将该对象恢复到原先保存的状态。 
 *
 *	注意：当保存的状态太大时，占内存比较大
 */
public class MementoModelTest {

	public static void main(String[] args) {
		
		/* 模板模式测试：
		 * Originator originator = new Originator();
		originator.setState("On...");
		originator.show();
		
		CareTaker careTaker = new CareTaker();
		//备份
		careTaker.saveMemento(originator.createMemento());
		
		originator.setState("Off...");
		originator.show();
		
		//还原
		originator.returnToBefore(careTaker.getMemento());
		originator.show();*/
		
		
		GameRole gameRole = new GameRole();
		gameRole.setName("皇子");
		gameRole.setLifeVal(100);
		gameRole.setDefenceVal(87);
		gameRole.setAttackVal(95);
		System.out.println("出战前的状态：");
		gameRole.show();
		
		GameCareTaker careTaker = new GameCareTaker(gameRole.createGameMemento());
		gameRole.setLifeVal(60);
		gameRole.setDefenceVal(80);
		gameRole.setAttackVal(92);
		System.out.println("战到残血：");
		gameRole.show();
		
		gameRole.returnToBefore(careTaker.getGameMemento());
		System.out.println("满血复原：");
		gameRole.show();
		
		
	}

}
