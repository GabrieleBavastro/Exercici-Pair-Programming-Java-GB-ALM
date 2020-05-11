package com.floristeria.project;

public class Tree extends Product {
	private double height;

	public Tree(String name, double price, double size) {
		super(name, price);
		this.height = size;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "\nTree: \n" + " Name: " + getName() + "\n Cost: " + getCost() + "€\n" + " Height:" + getHeight() + "\n";
	}

}
