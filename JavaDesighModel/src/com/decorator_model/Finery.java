package com.decorator_model;

class Finery extends Person {
	Person component;

	public Finery() {
	}

	public Finery(String name) {
		super(name);
	}

	//´ò°ç
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
		System.out.println("TÐô");
	}
}

class BigTrouser extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("¿å¿ã");
	}
}

class Sneakers extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("ÆÆÇòÐ¬");
	}
}

class Suit extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("Î÷×°");
	}
}

class Tie extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("Áì´ø");
	}
}

class LeatherShoes extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println("Æ¤Ð¬");
	}
}