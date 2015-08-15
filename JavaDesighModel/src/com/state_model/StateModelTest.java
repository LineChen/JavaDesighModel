package com.state_model;

/**
 * 状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来是改变了其类
 *
 * 状态模式解决的主要问题是：当控制一个对象状态转换的条件表达式过于复杂的情况.
 *  把状态的判断逻辑转移到表示不同状态的一系列类中,可以把复杂的逻辑判断简化.
 */
public class StateModelTest {

	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(11);
		work.writeProgram();
		
		work.setHour(2);
		work.setFinish(false);
		work.writeProgram();
		
		
	}

}
