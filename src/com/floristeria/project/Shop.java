package com.floristeria.project;

import java.util.ArrayList;

public class Shop {
	private String name;
	private ArrayList<Product> productsList;

	public Shop(String name) {
		this.name = name;
		this.productsList = new ArrayList<Product>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(ArrayList<Product> productsList) {
		this.productsList = productsList;
	}
	
	public void addProduct(Product product) {
		this.productsList.add(product);
	}
	
	public void printStocks() {
		String trees = "Trees: \n ";
		String flowers = "Flowers: \n";
		String decorations = "Decorations: \n";
		for(Product p : productsList) {
			if (p instanceof Tree) {
				trees += "T";
			} else if (p instanceof Flower) {
				flowers += "Y";
			} else if (p instanceof Decoration) {
				decorations += "X";
			}
		}
		System.out.println(trees);
		System.out.println(flowers);
		System.out.println(decorations);
	}
}
