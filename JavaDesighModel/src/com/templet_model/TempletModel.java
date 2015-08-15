package com.templet_model;

/**
 * ģ��ģʽ:����һ�������е��㷨�ĹǼܣ�����һЩ�����ӳٵ������С�
 * ģ�巽��ʹ��������Բ��ı�һ���㷨�Ľṹ�����ض�����㷨��ĳЩ�ض�����
 *
 */
public class TempletModel {

	public static void main(String[] args) {
		SuperMan spiderMan = new SpiderMan();
		SuperMan ironMan = new IronMan();

		spiderMan.saveWorld();
		ironMan.saveWorld();

	}

}

abstract class SuperMan {

	public void saveWorld() {
		save();
		overCome();
	}

	abstract public void save();

	abstract public void overCome();

}

class SpiderMan extends SuperMan {
	
	@Override
	public void save() {
		System.out.println("����֩������������������");
	}

	@Override
	public void overCome() {
		System.out.println("����֩�������Ұ�����������");
	}

}

class IronMan extends SuperMan {

	@Override
	public void save() {
		System.out.println("���Ǹ�������������������");
	}

	@Override
	public void overCome() {
		System.out.println("���Ǹ��������Ұ�����������");
	}

}
