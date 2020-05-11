package com.floristeria.project;

public class Decoration extends Product {
	private Type type;

	public Decoration(String name, double price, Type type) {
		super(name, price);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nDecoration: \n" + " Name: " + getName() + "\n Cost: " + getCost() + "€\n" + " Type:" + getType()
				+ "\n";
	}

}
