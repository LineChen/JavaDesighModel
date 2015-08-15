package com.adapter_model;

/**
 *
 *适配器模式：
 *系统的数据和行为都正确，但接口不符，应该考虑使用适配器，目的是使控制范围之外的一个原有对象
 *与某个接口匹配，适配器主要应用于希望复用一些现存的类，但是接口又与复用要求不一致的情况
 *
 */
public class AdapterModelTest {

	public static void main(String[] args) {
		Player Mikal = new Forwards("麦迪");
		
		Player Badial = new Center("巴蒂尔");
		
		Player YaoMing = new Translator("姚明");
		
		Mikal.attack();
		
		Badial.defence();
		
		YaoMing.attack();
		YaoMing.defence();
	}	

}
