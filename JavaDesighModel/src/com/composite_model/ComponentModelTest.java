package com.composite_model;

/**
 * ���ģʽ����������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ��
 * ���ģʽʹ���û��Ե����������϶����ʹ�þ���һ����
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


















