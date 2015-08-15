package com.state_model;

abstract class State {
	public abstract void writeProgram(Work w);
}

class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12 && w.getHour() > 9){
			System.out.println("��ǰʱ��:" + w.getHour() + " ���繤��������ٱ�");
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
			System.out.println("��ǰʱ��:" + w.getHour() + " �緹ʱ�䣬������");
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
			System.out.println("��ǰʱ��:" + w.getHour() + " ״̬��������Ŭ��");
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
				System.out.println("��ǰʱ��:" + w.getHour() + " �Ӱ�,ƣ������");
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
		System.out.println("��ǰʱ��:" + w.getHour() + " �����ˣ�˯����");
	}

}

class ResetState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("��ǰʱ��:" + w.getHour() + " �°�ؼ�");
	}

}
