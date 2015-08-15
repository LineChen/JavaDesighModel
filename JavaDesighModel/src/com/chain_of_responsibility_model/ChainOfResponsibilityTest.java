package com.chain_of_responsibility_model;

/**
 * 责任链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的
 * 耦合关系，将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
 * @author Administrator
 *
 */
public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("经理");
		MajorDomo majorDomo = new MajorDomo("总监");
		GeneralManager generalManager = new GeneralManager("总经理");
		commonManager.setSuperior(majorDomo);
		majorDomo.setSuperior(generalManager);
		
		
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("xxx请假");
		request.setNum(4);
		commonManager.requestApplications(request);
		request.setRequestType("加薪");
		request.setRequestContent("xxx加薪");
		request.setNum(5000);
		commonManager.requestApplications(request);
	}	

}
