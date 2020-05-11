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
	
	public void printTrees() {
		String trees = "";
		for(Product p : productsList) {
			if (p instanceof Tree) {
				trees += "T";
			}
		}
		System.out.println(trees);
	}
	
	public void printFlowers() {
		String flowers = "";
		for(Product p : productsList) {
			if (p instanceof Flower) {
				flowers += "Y";
			}
		}
		System.out.println(flowers);
	}
	
	public void printDecorations() {
		String decorations = "";
		for(Product p : productsList) {
			if (p instanceof Decoration) {
				decorations += "X";
			}
		}
		System.out.println(decorations);
	}

}
