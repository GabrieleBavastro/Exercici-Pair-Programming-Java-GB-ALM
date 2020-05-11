package com.floristeria.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner((System.in));
	static ArrayList<Shop> shopList = new ArrayList<Shop>();
	static ArrayList<Product> productList = new ArrayList<Product>();

	public static void main(String[] args) {

		// Add Preload Products

		if (productList.size() == 0) {
			try {
				productList.add(new Tree("tree", 10, 15));
				productList.add(new Flower("flower", 5.5, "red"));
				Type type = Type.PLASTIC;
				productList.add(new Decoration("decoration", 5.5, type));
			} catch (Exception e) {
				writeToLog(new Exception("Something wrong with preloaded product data"));
				e.printStackTrace();
			}

		}

		System.out.println("Welcome to Future Flower Shop! What do you want to do?"
				+ "\n 1 - Create a new Flower Shop. \n 2 - Exit.");

		String initialInput = scanner.next();

		// Switch Main.

		switch (initialInput) {

		case "1":
			// Sign Up.
			System.out.println("You chosed create a new Flower Shop!");
			Shop newShop = null;

			System.out.println("Please introduce your name without blank spaces.");
			String name = (scanner.next().toLowerCase());

			try {
				newShop = new Shop(name);
			} catch (Exception e) {
				writeToLog(new Exception("Something wrong with create a new shop"));
				e.printStackTrace();
			}
			shopList.add(newShop);
			System.out.println("The new Flower Shop has been created!" + newShop.toString());
			Main.shopConsole(newShop);
			break;

		case "2":
			// Exit.
			System.out.println("Good  Bye! We hope to see you again soon!");
			break;

		default:
			System.out.println("ERROR! Please choose a number between 1 and 2!");
			Main.main(args);
		}

	}

	private static void writeToLog(Exception exception) {
		// TODO Auto-generated method stub

	}

	public static void shopConsole(Shop newShop) {

		System.out.println("What do you want to do?" + "\n 1 - Add a new Tree. "
				+ "\n 2 - Add a new Flower. \n 3 - Add a new Garden Decoration. "
				+ "\n 4 - Check your Products in Stock. \n 5 - Exit.");
		String shopConsoleOption = scanner.next();

		// Switch Shop Console Options.

		switch (shopConsoleOption) {
		case "1":
			System.out.println("You chosed introduce a new tree!");

			System.out.println("Please introduce the name of your tree without blank spaces.");
			String nameT = (scanner.next().toLowerCase());

			System.out.println("Please introduce the height of the tree without blank spaces.");
			Double heightT = (scanner.nextDouble());

			System.out.println("Please introduce the price without blank spaces.");
			Double priceT = (scanner.nextDouble());

			Product newProductT = new Tree(nameT, priceT, heightT);
			newShop.addProduct(newProductT);
			System.out.println("The new Tree has been introduced! \n" + newProductT.toString());
			Main.shopConsole(newShop);
			break;
		case "2":
			System.out.println("You chosed introduce a new Flower!");

			System.out.println("Please introduce the name of your Flower without blank spaces.");
			String nameF = (scanner.next().toLowerCase());

			System.out.println("Please introduce the color of the Flower without blank spaces.");
			String colorF = (scanner.next().toLowerCase());

			System.out.println("Please introduce the price without blank spaces.");
			Double priceF = (scanner.nextDouble());

			Product newProductF = new Flower(nameF, priceF, colorF);
			newShop.addProduct(newProductF);
			System.out.println("The new Flower has been introduced! \n" + newProductF.toString());
			Main.shopConsole(newShop);
			break;
		case "3":
			System.out.println("You chosed introduce a new Decoration!");

			System.out.println("Please introduce the name of your Decoration without blank spaces.");
			String nameD = (scanner.next().toLowerCase());

			boolean isRight = true;
			Type matt = null;
			do {
				System.out.println(
						"Please introduce the material of the Decoration without blank spaces. (plastic or wood)");
				String materialD = (scanner.next().toLowerCase());

				if (materialD.equals("plastic")) {
					matt = Type.PLASTIC;
					isRight = false;
				} else if (materialD.equalsIgnoreCase("wood")) {
					matt = Type.WOOD;
					isRight = false;
				} else {
					System.out.println("Material not valid");
				}
			} while (isRight);

			System.out.println("Please introduce the price without blank spaces.");
			Double priceD = (scanner.nextDouble());

			Product newProductD = new Decoration(nameD, priceD, matt);
			newShop.addProduct(newProductD);
			System.out.println("The new Decoration has been introduced! \n" + newProductD.toString());
			Main.shopConsole(newShop);
			break;
		case "4":
			System.out.println("Your Products in Stock  are:");
			System.out.println(productList.toString().substring(1).replaceFirst("]", "").replaceAll(",", ""));
			newShop.printStocks();
			Main.shopConsole(newShop);
			break;
		case "5":
			System.out.println("Good Bye! We hope to see you again soon!");
			break;
		default:
			System.out.println("ERROR! Please choose a number between 1 and 5!");
			Main.shopConsole(newShop);
		}
	}
}
