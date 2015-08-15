package com.bridge_model;

abstract class HandsetSoft {
	public abstract void run();
}

/**
 * 手机软件
 * @author Administrator
 *
 */
class HandsetGame extends HandsetSoft{

	@Override
	public void run() {
		System.out.println("运行游戏");
	}
	
}


class HandsetAdressList extends HandsetSoft{

	@Override
	public void run() {
		System.out.println("运行通讯录");
	}
	
}











