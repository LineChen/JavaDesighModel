package com.chain_of_responsibility_model;

abstract class Manager {
	protected String name;
	
	protected Manager superior;
	
	
	public Manager(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Manager getSuperior() {
		return superior;
	}


	public void setSuperior(Manager superior) {
		this.superior = superior;
	}


	//申请请求
	public abstract void requestApplications(Request request);
}



class CommonManager extends Manager{

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.getRequestType().equals("请假") && request.getNum() < 3){
			System.out.println("批准：" + request);
		} else{
			if(this.superior != null){
				superior.requestApplications(request);
			}
		}
	}
	
}

class MajorDomo extends Manager{

	public MajorDomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.getRequestType().equals("请假") && request.getNum() < 6){
			System.out.println("批准：" + request);
		} else{
			if(this.superior != null){
				superior.requestApplications(request);
			}
		}
	}
	
}


class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if(request.getRequestType().equals("请假")){
			System.out.println("批准：" + request);
		} else if(request.getRequestType().equals("加薪") && request.getNum() <= 3000){
			System.out.println("批准：" + request);
		} else if(request.getRequestType().equals("加薪") && request.getNum() > 3000){
			System.out.println("再说吧：" + request);
		}
	}
	
}




















