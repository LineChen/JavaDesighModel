package com.decorator_model;

class Finery extends Person {
	Person component;

	public Finery() {
	}

	public Finery(String name) {
		super(name);
	}

	//���
	public void decorate(Person component){
		this.component = component;
	}
	
	public void show() {
		if(component != null){
			component.show();
		}
	}
}

class TShirts extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("T��");
	}
}

class BigTrouser extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("���");
	}
}

class Sneakers extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("����Ь");
	}
}

class Suit extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("��װ");
	}
}

class Tie extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("���");
	}
}

class LeatherShoes extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("ƤЬ");
	}
}