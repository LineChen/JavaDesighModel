package com.memento_model;

/**
 * 游戏角色：发起者
 * 
 * @author Administrator
 *
 */
public class GameRole {
	private String name;
	private int lifeVal;
	private int attackVal;
	private int defenceVal;
	
	//创建 备忘录
	public GameMemento createGameMemento(){
		return new GameMemento(lifeVal, attackVal, defenceVal);
	}
	
	//从备忘录恢复
	public void returnToBefore(GameMemento memento){
		this.lifeVal = memento.getLifeVal();
		this.attackVal = memento.getAttackVal();
		this.defenceVal = memento.getDefenceVal();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifeVal() {
		return lifeVal;
	}

	public void setLifeVal(int lifeVal) {
		this.lifeVal = lifeVal;
	}

	public int getAttackVal() {
		return attackVal;
	}

	public void setAttackVal(int attackVal) {
		this.attackVal = attackVal;
	}

	public int getDefenceVal() {
		return defenceVal;
	}

	public void setDefenceVal(int defenceVal) {
		this.defenceVal = defenceVal;
	}

	public void show() {
		System.out.println("GameRole [name=" + name + ", lifeVal=" + lifeVal
				+ ", attackVal=" + attackVal + ", defenceVal=" + defenceVal
				+ "]");
	}

}

/**
 * 游戏备忘录:保存生命值、攻击力、防御力
 * 
 * @author Administrator
 *
 */
class GameMemento {
	private int lifeVal;
	private int attackVal;
	private int defenceVal;

	public GameMemento(int lifeVal, int attackVal, int defenceVal) {
		this.lifeVal = lifeVal;
		this.attackVal = attackVal;
		this.defenceVal = defenceVal;
	}

	public int getLifeVal() {
		return lifeVal;
	}

	public void setLifeVal(int lifeVal) {
		this.lifeVal = lifeVal;
	}

	public int getAttackVal() {
		return attackVal;
	}

	public void setAttackVal(int attackVal) {
		this.attackVal = attackVal;
	}

	public int getDefenceVal() {
		return defenceVal;
	}

	public void setDefenceVal(int defenceVal) {
		this.defenceVal = defenceVal;
	}

}

/**
 * 备忘录保存者
 *
 */
class GameCareTaker{
	private GameMemento gameMemento;
	
	public GameCareTaker(GameMemento gameMemento){
		this.gameMemento = gameMemento;
	}

	public GameMemento getGameMemento() {
		return gameMemento;
	}

	//保存游戏进度
	public void saveGameMemento(GameMemento gameMemento) {
		this.gameMemento = gameMemento;
	}
	
	
	
}


















