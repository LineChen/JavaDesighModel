package com.adapter_model;

/**
 *
 *������ģʽ��
 *ϵͳ�����ݺ���Ϊ����ȷ�����ӿڲ�����Ӧ�ÿ���ʹ����������Ŀ����ʹ���Ʒ�Χ֮���һ��ԭ�ж���
 *��ĳ���ӿ�ƥ�䣬��������ҪӦ����ϣ������һЩ�ִ���࣬���ǽӿ����븴��Ҫ��һ�µ����
 *
 */
public class AdapterModelTest {

	public static void main(String[] args) {
		Player Mikal = new Forwards("���");
		
		Player Badial = new Center("�͵ٶ�");
		
		Player YaoMing = new Translator("Ҧ��");
		
		Mikal.attack();
		
		Badial.defence();
		
		YaoMing.attack();
		YaoMing.defence();
	}	

}
