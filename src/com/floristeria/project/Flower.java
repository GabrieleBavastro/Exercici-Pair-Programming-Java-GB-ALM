package com.floristeria.project;

public class Flower extends Product {

	private String color;

	public Flower(String name, double price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "\nFlower: \n" + " Name: " + getName() + "\n Cost: " + getCost() + "�\n" + " Color:" + getColor() + "\n";
	}
}
