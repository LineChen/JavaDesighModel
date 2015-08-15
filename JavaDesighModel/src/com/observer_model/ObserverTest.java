package com.observer_model;

/**
 * �۲���ģʽ��������һ��һ�Զ��������ϵ��
 * 	�ö���۲��߶���ͬʱ����һ��Subject���󣨱��۲��ߣ���������۲��߶����ڷ���״̬�ı�ʱ
 * ��֪ͨ���й۲�ñ��۲��ߵĶ���ʹ�����ܹ��Զ������Լ�
 * 
 * @author Administrator
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
//		Subject secretary = new Secretary();
		Subject boss = new Boss();
		
		StockObserver s1 = new StockObserver("Tiger", boss);
		StockObserver s2 = new StockObserver("Green", boss);
		NBAObserver n1 = new NBAObserver("Bitch", boss);
		
		boss.attach(s1);
		boss.attach(s2);
		boss.attach(n1);
		
		boss.detach(n1);
		
		
		
		boss.setAction("��boss������");
		boss.Notify();
	}

}
