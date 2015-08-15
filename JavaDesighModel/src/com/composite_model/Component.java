package com.composite_model;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象类：
 * @author Administrator
 *
 */
public abstract class Component {
	String name;
	
	public Component(String name){
		this.name = name;
	}
	
	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void display(int depth);
}

/**
 * 叶子
 * @author Administrator
 *
 */
class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("cannot add a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		for(int i = 0; i < depth; i++)
			System.out.print("-");
		System.out.println(name);
	}
}


/**
 * 树枝，可以有有自己的叶子节点
 * @author Administrator
 *
 */
class Composite extends Component{

	List<Component> list = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public void display(int depth) {
		for(int i = 0; i < depth; i++)
			System.out.print("-");
		System.out.println(name);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).display(depth + 2);
		}
	}
}






















