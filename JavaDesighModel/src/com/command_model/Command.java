package com.command_model;

abstract class Command {
	Barbecuer barbecuer;

	String name;
	
	public Command(Barbecuer barbecuer, String name) {
		this.barbecuer = barbecuer;
		this.name = name;
	}

	public abstract void executeCommand();

	@Override
	public String toString() {
		return "Command [name=" + name + "]";
	}
	
	
}

class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer barbecuer, String name) {
		super(barbecuer, name);
	}

	@Override
	public void executeCommand() {
		barbecuer.bakeMutton();
	}
}

class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer barbecuer, String name) {
		super(barbecuer, name);
	}

	@Override
	public void executeCommand() {
		barbecuer.bakeChichenWing();
	}
}



