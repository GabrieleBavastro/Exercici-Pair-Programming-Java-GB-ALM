package com.floristeria.project;

public class Product {
	private String name;
	private double cost;

	public Product(String name, double price) {
		this.name = name;
		this.cost = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
