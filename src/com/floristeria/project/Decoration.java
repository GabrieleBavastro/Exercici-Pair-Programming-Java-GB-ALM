package com.floristeria.project;

public class Decoration extends Product {
	private Type type;

	public Decoration(String name, double price, Type type) {
		super(name, price);
		type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	

}
