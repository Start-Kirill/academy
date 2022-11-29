/*
 * Task1
 * 
 * Kirill Starovoitov
 */
package by.academy.homework1;

import java.util.Scanner;

/**
 * Implementation of task 1 of homework 1. This program identifies a size of
 * discount depending on the total cost of items and age of a buyer. The final
 * cost of items is shown in the console.
 *
 * @version 1.0 25 Nov 2022
 * @author Kirill Starovoitov
 */
public class Task1 {

	/** The entering point to the program */
	public static void main(String args[]) {

		/* Variable for storing sum of money for payment */
		double total;

		/* Variable for storing age of a buyer */
		int age;

		/* Making scanner for reading and writing down data from console. */
		Scanner scan = new Scanner(System.in);

		/*
		 * Input total cost from console. The cost can't be negative value. If it's
		 * negative value input will repeat
		 */
		do {
			System.out.println("Enter total cost: ");
			total = scan.nextDouble(); // Input
		} while (total < 0); // Checking

		/*
		 * Input age of buyer from console. Age can't be negative value. If it's
		 * negative value input will repeat
		 */
		do {
			System.out.println("Enter age of buyer: ");
			age = scan.nextInt(); // Input
		} while (age < 0); // Checking

		scan.close(); // Closing scanner

		/*
		 * Choosing appropriate option depending on amount of payment and age of buyer
		 */
		if (total < 100) {
			total = total - total * 0.05; // Discount is 5%
		} else if (total >= 100 && total < 200) {
			total = total - total * 0.07; // Discount is 7%
		} else if (total >= 200 && total < 300) {
			if (age > 18) {
				total = total - total * 0.16; // Discount is 16%
			} else {
				total = total - total * 0.09; // Discount is 9%
			}
		} else if (total >= 300 && total < 400) {
			total = total - total * 0.15; // Discount is 15%
		} else {
			total = total - total * 0.2; // Discount is 20%
		}

		System.out.println("The final cost is $" + total); // Output the final cost to console
	}

}
