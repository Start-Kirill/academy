package by.academy.homework3.test;

import java.util.Scanner;

public class Application {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Person seller = makeSeller();
		Person buyer = makeBuyer();
		Product[] products = makeProducts();

		char answer = 'y';

		Deal deal = new Deal(seller, buyer, products);

		while (!(deal.deal())) {
			System.out.println("Would you like delete any product? y/n");
			answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				deal.setProducts(deleteProduct(products));
			} else {
				System.out.println("The deal is impossible!");
				break;
			}
		}

		if (answer == 'Y' || answer == 'y') {
			System.out.println("The deal is done!");
		}

		System.out.println(seller);
		System.out.println(buyer);
		sc.close();

	}

	private static Person makeSeller() {
		System.out.println("Enter name of seller:");
		String name = sc.next();
		System.out.println("Enter how much money seller has:");
		double money = sc.nextDouble();
		System.out.println("Enter age of seller:");
		int age = sc.nextInt();
		Person seller = new Person(name, money, age);
		return seller;

	}

	private static Person makeBuyer() {
		System.out.println("Enter name of buyer:");
		String name = sc.next();
		System.out.println("Enter how much money buyer has:");
		double money = sc.nextDouble();
		System.out.println("Enter age of buyer:");
		int age = sc.nextInt();
		Person buyer = new Person(name, money, age);
		return buyer;

	}

	private static Product[] makeProducts() {
		Product[] products = new Product[300];
		int counterProducts = -1;
		char indicator = 'y';
		int numberProduct = 0;
		while (indicator == 'y' || indicator == 'Y') {
			counterProducts++;
			do {
				System.out.println("Pick a product: 1 - Beer, 2 - Prawns, 3 - Lime");
				numberProduct = sc.nextInt();
			} while (numberProduct > 3 && numberProduct < 1);

			switch (numberProduct) {
			case 1:
				products[counterProducts] = makeBeer();
				break;
			case 2:
				products[counterProducts] = makePrawns();
				break;
			case 3:
				products[counterProducts] = makeLime();
				break;
			}

			System.out.println("Would you like pick more products: y/n ?");
			indicator = sc.next().charAt(0);
		}
		return products;
	}

	private static Product makeBeer() {
		System.out.println("Enter name of beer:");
		String name = sc.next();
		System.out.println("Enter quantity of beer:");
		double quantity = sc.nextDouble();
		System.out.println("Enter price of beer:");
		double price = sc.nextDouble();
		System.out.println("Enter volume of an unit:");
		double volume = sc.nextDouble();
		System.out.println("Enter type of beer:");
		String type = sc.next();
		Product beer = new Beer(name, quantity, price, volume, type);
		return beer;
	}

	private static Product makePrawns() {
		System.out.println("Enter name of prawns:");
		String name = sc.next();
		System.out.println("Enter weight of prawns:");
		double quantity = sc.nextDouble();
		System.out.println("Enter price of prawns:");
		double price = sc.nextDouble();
		System.out.println("Enter variety of prawns:");
		String variety = sc.next();
		System.out.println("Enter size of prawns:");
		char size = sc.next().charAt(0);
		Product prawns = new Prawns(name, quantity, price, variety, size);
		return prawns;
	}

	private static Product makeLime() {
		System.out.println("Enter name of lime:");
		String name = sc.next();
		System.out.println("Enter quantity of limes:");
		double quantity = sc.nextDouble();
		System.out.println("Enter price of lime:");
		double price = sc.nextDouble();
		System.out.println("Enter size of limes:");
		char size = sc.next().charAt(0);
		System.out.println("Enter age of limes in days:");
		int ageLime = sc.nextInt();
		Product lime = new Lime(name, quantity, price, size, ageLime);
		return lime;
	}

	private static Product[] deleteProduct(Product[] products) {
		String productName;
		int index = -1;

		do {
			System.out.println("Enter name of product to be deleted from list:");
			for (Product product : products) {
				if (product != null) {
					System.out.println(product.getName());
				}
			}
			productName = sc.next();

			for (int i = 0; i < products.length; i++) {
				if (products[i] != null) {
					if (productName.toLowerCase().equals(products[i].getName().toLowerCase())) {
						index = i;
						break;
					}
				}
			}

		} while (index == -1);

		products[index] = null;
		return products;
	}

}
