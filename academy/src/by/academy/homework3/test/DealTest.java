package by.academy.homework3.test;

import java.util.Scanner;

import by.academy.homework3.deal.Beer;
import by.academy.homework3.deal.Deal;
import by.academy.homework3.deal.Lime;
import by.academy.homework3.deal.Person;
import by.academy.homework3.deal.Prawns;
import by.academy.homework3.deal.Product;

public class DealTest {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Person seller = new Person("Evroopt", 1000, 20);
		Person buyer = new Person("Kirill", 33, 29);
		Product beer = new Beer("Lidskoe", 4, 2.8, 0.5, "IPA");
		Product prawns = new Prawns("Prawns", 1.2, 24.99, "Horth", 'S');
		Product lime = new Lime("Taiti", 2, 1.5, 'S', 31);
		Product[] products = { beer, prawns, lime, null };

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
