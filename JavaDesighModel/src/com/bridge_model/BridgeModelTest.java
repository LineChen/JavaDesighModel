package com.bridge_model;
/**
 *合成/聚合复用原则：尽量使用合成/聚合，尽量不使用类继承。
 *
 *聚合：表示一种弱的“拥有”关系，体现是A对象可以包含B对象，但B对象不是A对象的一部分；
 *
 *合成：表示一种强的“拥有”关系，体现严格的部分和整体的关系，部分和整体的生命周期一样
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
