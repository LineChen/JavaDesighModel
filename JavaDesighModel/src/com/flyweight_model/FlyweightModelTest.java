package com.flyweight_model;

/**
 * 享元模式：运用共享技术有效地支持大量细粒度的对象.
 * 在享元对象内部并且不会随环境改变而改变的共享部分，可以称为享元对象的内部状态，而随着环境改变而改变的、不可以共享的状态就是外部状态了，
 * 享元模式可以避免大量非常相似类的开销。在程序设计中，有时需要生成大量细粒度的类实例来表示数据。如果能发现这些实例除了几个参数外基本是相同的
 * 有时就能受大幅度的减少需要实例化的类的数量。如果能把那些参数移到类实例的外面，在方法调用时将它们传递进来，就可以通过共享大幅度的减少单个实例的数目
 * 
 * 应用场合：如果一个程序使用了大量的对象，而大量的这些对象造成了很大的存储开销就应该考虑使用。还有就是对象的大多数状态可以外部状态，如果删除对象的外部状态，
 * 那么可以用相对较少的共享对象取得很多组对象，此时可以考虑使用这种模式
 * 
 * 注意：使用享元模式需要维护一个记录了系统已有的所有享元的列表，而这本身需要耗费资源，而另外享元模式使得系统更加复杂，为了使对象可以共享时才值得使用享元模式
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

		Website web_display1 = websiteFactory.getWebsite("产品展示");
		web_display1.use(new User("大佬"));

		Website web_display2 = websiteFactory.getWebsite("产品展示");
		web_display2.use(new User("韩"));

		Website web_blog = websiteFactory.getWebsite("个人博客");
		web_blog.use(new User("残阳"));

	}

}
