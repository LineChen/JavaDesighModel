package com.chain_of_responsibility_model;

class Request {
	private String requestType;
	
	private String requestContent;
	
	private int num;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Request [requestType=" + requestType + ", requestContent="
				+ requestContent + ", num=" + num + "]";
	}
	
	
}
