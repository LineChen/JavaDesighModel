package com.bridge_model;
/**
 *�ϳ�/�ۺϸ���ԭ�򣺾���ʹ�úϳ�/�ۺϣ�������ʹ����̳С�
 *
 *�ۺϣ���ʾһ�����ġ�ӵ�С���ϵ��������A������԰���B���󣬵�B������A�����һ���֣�
 *
 *�ϳɣ���ʾһ��ǿ�ġ�ӵ�С���ϵ�������ϸ�Ĳ��ֺ�����Ĺ�ϵ�����ֺ��������������һ��
 *
 *
 *
 */
public class BridgeModelTest {
	public static void main(String[] args) {

		HandsetBrand brandA = new HandsetBrandA();
		
		HandsetBrand brandB = new HandsetBrandB();
		
		HandsetSoft gameSoft = new HandsetGame();
		HandsetSoft adressSoft = new HandsetAdressList();
		
		brandA.setSoft(gameSoft);
		brandA.run();
		
		brandA.setSoft(adressSoft);
		brandA.run();
		
		brandB.setSoft(gameSoft);
		brandB.run();
		
		
	}
}
