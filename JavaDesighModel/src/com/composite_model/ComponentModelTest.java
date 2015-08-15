package com.composite_model;

/**
 * 组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构。
 * 组合模式使得用户对单个对象和组合对象的使用具有一致性
 * @author Administrator
 *
 */
public class ComponentModelTest {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("LeafA"));
		root.add(new Leaf("LeafB"));
		
		Composite compositeX = new Composite("CompositeX");
		compositeX.add(new Leaf("LeafXA"));
		compositeX.add(new Leaf("LeafXB"));
		
		root.add(compositeX);
		
		Composite compositeY = new Composite("CompositeX");
		compositeY.add(new Leaf("LeafYA"));
		compositeY.add(new Leaf("LeafYB"));
		
		root.add(compositeY);
		
		root.add(new Leaf("LeafC"));
		
		Leaf leafD = new Leaf("leafD");
		root.add(leafD);
		root.remove(leafD);
		
		root.display(1);
	}
}


















