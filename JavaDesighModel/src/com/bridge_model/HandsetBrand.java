package com.bridge_model;

/**
 * �ֻ�Ʒ�Ƴ�����
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
 * AƷ���ֻ�
 * @author Administrator
 *
 */
class HandsetBrandA extends HandsetBrand{

	@Override
	public void run() {
		System.out.print("AƷ�ƣ�");
		this.soft.run();
	}
	
}

/**
 * BƷ���ֻ�
 * @author Administrator
 *
 */
class HandsetBrandB extends HandsetBrand{

	@Override
	public void run() {
		System.out.print("BƷ�ƣ�");
		this.soft.run();
	}
	
}




