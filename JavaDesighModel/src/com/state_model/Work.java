package com.state_model;

class Work {
	private int hour;

	private boolean finish;

	private State curState;

	public Work() {
		curState = new ForenoonState();
	}

	public State getCurState() {
		return curState;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void writeProgram() {
		this.curState.writeProgram(this);
	}
}
