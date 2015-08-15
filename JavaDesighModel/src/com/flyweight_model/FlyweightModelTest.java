package com.flyweight_model;

/**
 * ��Ԫģʽ�����ù�������Ч��֧�ִ���ϸ���ȵĶ���.
 * ����Ԫ�����ڲ����Ҳ����滷���ı���ı�Ĺ����֣����Գ�Ϊ��Ԫ������ڲ�״̬�������Ż����ı���ı�ġ������Թ����״̬�����ⲿ״̬�ˣ�
 * ��Ԫģʽ���Ա�������ǳ�������Ŀ������ڳ�������У���ʱ��Ҫ���ɴ���ϸ���ȵ���ʵ������ʾ���ݡ�����ܷ�����Щʵ�����˼����������������ͬ��
 * ��ʱ�����ܴ���ȵļ�����Ҫʵ�������������������ܰ���Щ�����Ƶ���ʵ�������棬�ڷ�������ʱ�����Ǵ��ݽ������Ϳ���ͨ���������ȵļ��ٵ���ʵ������Ŀ
 * 
 * Ӧ�ó��ϣ����һ������ʹ���˴����Ķ��󣬶���������Щ��������˺ܴ�Ĵ洢������Ӧ�ÿ���ʹ�á����о��Ƕ���Ĵ����״̬�����ⲿ״̬�����ɾ��������ⲿ״̬��
 * ��ô��������Խ��ٵĹ������ȡ�úܶ�����󣬴�ʱ���Կ���ʹ������ģʽ
 * 
 * ע�⣺ʹ����Ԫģʽ��Ҫά��һ����¼��ϵͳ���е�������Ԫ���б����Ȿ����Ҫ�ķ���Դ����������Ԫģʽʹ��ϵͳ���Ӹ��ӣ�Ϊ��ʹ������Թ���ʱ��ֵ��ʹ����Ԫģʽ
 *
 */
public class FlyweightModelTest {

	public static void main(String[] args) {
		/*
		 * int state = 10; FlyweightFactory factory = new FlyweightFactory();
		 * 
		 * Flyweight fx = factory.getFlyweight("X");
		 * 
		 * Flyweight fy = factory.getFlyweight("Y");
		 * 
		 * Flyweight fz = factory.getFlyweight("Z");
		 * 
		 * fx.operation(++state); fy.operation(++state); fz.operation(++state);
		 * 
		 * Flyweight fN = new UnsharedConcreteFlyweight();
		 * fN.operation(++state);
		 */

		WebsiteFactory websiteFactory = new WebsiteFactory();

		Website web_display1 = websiteFactory.getWebsite("��Ʒչʾ");
		web_display1.use(new User("����"));

		Website web_display2 = websiteFactory.getWebsite("��Ʒչʾ");
		web_display2.use(new User("��"));

		Website web_blog = websiteFactory.getWebsite("���˲���");
		web_blog.use(new User("����"));

	}

}
