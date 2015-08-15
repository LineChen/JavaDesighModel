package com.visotor_model;

public class VisitorModelTest {

	public static void main(String[] args) {
		ObjectStructure structure = new ObjectStructure();
		
		structure.attach(new Man());
		structure.attach(new Woman());
		
		Action suceess = new Success();
		structure.display(suceess);
		
		Action failing = new Failing();
		structure.display(failing);
	}

}
