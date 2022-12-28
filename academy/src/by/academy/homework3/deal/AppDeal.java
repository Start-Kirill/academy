/*
 * Homework #3
 * 
 * Kirill Starovoitov
 */
package by.academy.homework3.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import by.academy.homework3.Task3.ValidationDate;
import by.academy.homework3.task5.BelarusPhoneValidator;
import by.academy.homework3.task5.EmailValidator;

/**
 * Implementation of Homework #3. Application for buying products
 * 
 * @version 1.0 27 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class AppDeal {

	private static final Scanner sc = new Scanner(System.in);
	private static final DateTimeFormatter formatterOne = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
	private static final DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
	private static final BelarusPhoneValidator phoneValidator = new BelarusPhoneValidator();
	private static final EmailValidator emailValidator = new EmailValidator();
	private static final ValidationDate dateValidator = new ValidationDate();

	public static void main(String[] args) {
		int option = 0; // option from the main menu
		boolean indicator = false; // indicator if a deal is successful
		Product[] products = new Product[16];
		Person seller = makePerson("seller");
		Person buyer = makePerson("buyer");
		Deal deal = new Deal(seller, buyer, products);

		printPerson(seller, buyer);

		do {
			printBasket(deal.getProducts());
			option = pickOption();
			switch (option) {
			case 1:
				deal.setProducts(makeProducts(deal.getProducts()));
				break;
			case 2:
				deal.setProducts(deleteProduct(deal.getProducts()));
				break;
			case 3:
				indicator = deal.deal();
				break;
			case 4:
				System.out.println("You gave up a deal!");
				return;
			}

		} while (!(indicator));

		printPerson(seller, buyer);
		printReceipt(deal);

		sc.close();
	}

	/**
	 * Method for making the participants of deal
	 * 
	 * @param type type of a participant
	 * @return Person object
	 */
	private static Person makePerson(String type) {

		System.out.printf("Enter name of %s:%n", type);
		String name = sc.next();

		System.out.printf("Enter how much money %s has:%n", type);
		double money = sc.nextDouble();

		String tempDate;
		do {
			System.out.printf("Enter date of birth of %s in format dd/MM/yyyy or dd-MM-yyyy:%n", type);
			tempDate = sc.next();
			dateValidator.setDate(tempDate);
		} while (!(dateValidator.validate()));

		dateValidator.setDivider(); // setting divider after be sure that a date is valid
		LocalDate dateOfBirth;
		if (dateValidator.getDivider() == '/') {
			dateOfBirth = LocalDate.parse(tempDate, formatterOne);
		} else {
			dateOfBirth = LocalDate.parse(tempDate, formatterTwo);
		}

		String phone;
		do {
			System.out.printf("Enter a phone number of %s:%n", type);
			phone = sc.next();
		} while (!(phoneValidator.validate(phone)));

		String email;
		do {
			System.out.printf("Enter an email of %s:%n", type);
			email = sc.next();
		} while (!(emailValidator.validate(email)));

		Person person = new Person(name, money, dateOfBirth, phone, email);
		return person;

	}

	/**
	 * Method for printing the basket of products
	 * 
	 * @param products Array of products
	 */
	private static void printBasket(Product[] products) {
		int counter = 0;
		System.out.println("Your basket of products:\n");
		System.out.printf("%-15s %15s%n", "Name of product", "Price");
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				System.out.printf("%-15s %15.2f %n", products[i].getName(), products[i].calcPrice());
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("Basket is empty");
		}
	}

	/**
	 * Method for picking an option of the menu
	 * 
	 * @return int like an option from menu
	 */
	private static int pickOption() {
		int option = 0;

		do {
			System.out.println("\nWhat would you like to do ? Pick an option please:");
			System.out.println("1 - add a product\n2 - remove a product\n3 - make a deal\n4 - interrupt a deal");
			if (sc.hasNextInt()) {
				option = sc.nextInt();
			}
		} while (!(option >= 1 && option <= 4));

		return option;
	}

	/**
	 * Method for making some products and making array of products bigger if it's
	 * needed
	 * 
	 * @param products Array of products
	 * @return Array of products
	 */
	private static Product[] makeProducts(Product[] products) {
		char indicator = 'y';
		int numberProduct = 0;
		int counterProducts = 0;
		while (indicator == 'y' || indicator == 'Y') {
			for (Product product : products) {
				if (product != null) {
					counterProducts++;
				}
			}
			if (counterProducts == products.length) {
				Product[] tempProducts = new Product[products.length * 2 + 1];
				System.arraycopy(products, 0, tempProducts, 0, products.length);
				products = tempProducts;
			}
			do {
				System.out.println("Pick a product:\n1 - Beer\n2 - Prawns\n3 - Lime\n4 - Back");
				numberProduct = sc.nextInt();
			} while (!(numberProduct <= 4 && numberProduct >= 1));

			switch (numberProduct) {
			case 1:
				for (int i = 0; i < products.length; i++) {
					if (products[i] == null) {
						products[i] = makeBeer();
						break;
					}
				}
				break;
			case 2:
				for (int i = 0; i < products.length; i++) {
					if (products[i] == null) {
						products[i] = makePrawns();
						break;
					}
				}
				break;
			case 3:
				for (int i = 0; i < products.length; i++) {
					if (products[i] == null) {
						products[i] = makeLime();
						break;
					}
				}
				break;
			case 4:
				return products;
			}

			printBasket(products);
			System.out.println("\nWould you like pick more products: y/n ?");
			indicator = sc.next().charAt(0);
			counterProducts = 0;
		}
		return products;
	}

	/**
	 * Method for making a beer
	 * 
	 * @return Product
	 */
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

	/**
	 * Method for making prawns
	 * 
	 * @return Product
	 */
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

	/**
	 * Method for making a lime
	 * 
	 * @return Product
	 */
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

	/**
	 * Method for removing a product from array of products
	 * 
	 * @param products Array of products
	 * @return Array of products
	 */
	private static Product[] deleteProduct(Product[] products) {
		String productName;
		int index = -1;

		do {
			printBasket(products);
			System.out.println("Enter name of product to be removed from the basket or \"back\" to return:");
			productName = sc.next();

			switch (productName) {
			case "back":
				return products;
			default:
				for (int i = 0; i < products.length; i++) {
					if (products[i] != null) {
						if (productName.toLowerCase().equals(products[i].getName().toLowerCase())) {
							index = i;
							break;
						}
					}
				}
			}
		} while (index == -1);

		products[index] = null;
		return products;
	}

	/**
	 * Method for printing the receipt
	 * 
	 * @param deal
	 */
	private static void printReceipt(Deal deal) {
		String divider = "-----------------------------------------------";
		System.out.printf("%-15s %30s%n%n", "Deadline", deal.getDeadlineDate());
		System.out.printf("%-15s %30s%n%n", "Date", LocalDate.now());
		System.out.printf("%-15s %5s %8s %8s %6s %n%s%n", "Name of product", "Price", "Quantity", "Discount", "Amount",
				divider);

		for (int i = 0; i < deal.getProducts().length; i++) {
			if (deal.getProducts()[i] != null) {
				System.out.printf("%-15s %5.2f %8.2f %7.2f%s %6.2f%n", deal.getProducts()[i].getName(),
						deal.getProducts()[i].getPrice(), deal.getProducts()[i].getQuantity(),
						(1 - deal.getProducts()[i].discount()) * 100, "%", deal.getProducts()[i].getFinalPrice());
			}
		}

		System.out.printf("%s%n%-15s %30.2f", divider, "TOTAL", deal.calcAmount());
	}

	/**
	 * Method for printing an information about participants of the deal
	 * 
	 * @param persons
	 */
	private static void printPerson(Person... persons) {
		for (Person person : persons) {
			System.out.printf("%-15s: %20s%n", "Name of person", person.getName());
			System.out.printf("%-15s: %20s%n", "Email", person.getEmail());
			System.out.printf("%-15s: %20s%n", "Phone number", person.getPhone());
			System.out.printf("%-15s: %20.2f%n", "Money", person.getMoney());
			System.out.printf("%-15s:%n", "Date of birth");
			System.out.printf("%-15s: %10s%n", "Day", person.getDateOfBirth().getDayOfMonth());
			System.out.printf("%-15s: %10s%n", "Month", person.getDateOfBirth().getMonth());
			System.out.printf("%-15s: %10s%n", "Year", person.getDateOfBirth().getYear());
			System.out.println();
		}
	}

}
