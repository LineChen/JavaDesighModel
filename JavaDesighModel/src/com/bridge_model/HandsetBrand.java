package com.bridge_model;

/**
 * 手机品牌抽象类
 * @author Administrator
 *
 */
abstract class HandsetBrand {
	HandsetSoft soft;
	
	public void setSoft(HandsetSoft soft){
		this.soft = soft;
	}
	
	public abstract void run();
}

/**
 * A品牌手机
 * @author Administrator
 *
 */
class HandsetBrandA extends HandsetBrand{

	@Override
	public void run() {
		System.out.print("A品牌：");
		this.soft.run();
	}
	
}

/**
 * B品牌手机
 * @author Administrator
 *
 */
class HandsetBrandB extends HandsetBrand{

	@Override
	public void run() {
		System.out.print("B品牌：");
		this.soft.run();
	}
	
}




