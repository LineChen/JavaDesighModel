package com.state_model;

abstract class State {
	public abstract void writeProgram(Work w);
}

class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12 && w.getHour() > 9){
			System.out.println("当前时间:" + w.getHour() + " 上午工作，精神百倍");
		} else {
			w.setCurState(new AfternoonState());
			w.writeProgram();
		}
	}
}

class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13){
			System.out.println("当前时间:" + w.getHour() + " 午饭时间，犯困了");
		} else {
			w.setCurState(new AfternoonState());
			w.writeProgram();
		}
	}

}

class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 17){
			System.out.println("当前时间:" + w.getHour() + " 状态不错，继续努力");
		} else {
			w.setCurState(new EveingState());
			w.writeProgram();
		}
	}

}

class EveingState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.isFinish()){
			w.setCurState(new ResetState());
			w.writeProgram();
		} else {
			if(w.getHour() < 21){
				System.out.println("当前时间:" + w.getHour() + " 加班,疲劳至极");
			} else {
				w.setCurState(new SleepingState());
				w.writeProgram();
			}
		}
	}

}

class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间:" + w.getHour() + " 不行了，睡着了");
	}

}

class ResetState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间:" + w.getHour() + " 下班回家");
	}

}
