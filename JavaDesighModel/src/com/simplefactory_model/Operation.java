package com.simplefactory_model;

abstract class Operation {
	private double numA;

	private double numB;

	abstract double getResult();

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}
}

class OperationAdd extends Operation {

	@Override
	double getResult() {
		double result = 0;
		return getNumA() + getNumB();
	}
}

class OperationSub extends Operation {

	@Override
	double getResult() {
		double result = 0;
		return getNumA() - getNumB();
	}
}

class OperationMul extends Operation {

	@Override
	double getResult() {
		double result = 0;
		return getNumA() * getNumB();
	}
}

class OperationDiv extends Operation {

	@Override
	double getResult() {
		double result = 0;
		if(getNumB() != 0)
			return getNumA() / getNumB();
		else
			return -0.00009;
	}
}

// class Operation {
// public double getResult(double numA, double numB, String operate) {
// double result = 0;
//
// switch (operate) {
// case "+":
// result = numA + numB;
// break;
// case "-":
// result = numA - numB;
// break;
// case "*":
// result = numA * numB;
// break;
// case "/":
// if (numB != 0) {
// result = numA / numB;
// } else {
// System.out.println("·ÖÄ¸Îª0");
// }
// break;
//
// }
// return result;
// }
// }

