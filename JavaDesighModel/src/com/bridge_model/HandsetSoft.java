package com.bridge_model;

abstract class HandsetSoft {
	public abstract void run();
}

/**
 * �ֻ����
 * @author Administrator
 *
 */
class HandsetGame extends HandsetSoft{

	@Override
	public void run() {
		System.out.println("������Ϸ");
	}
	
}


class HandsetAdressList extends HandsetSoft{

	@Override
	public void run() {
		System.out.println("����ͨѶ¼");
	}
	
}











