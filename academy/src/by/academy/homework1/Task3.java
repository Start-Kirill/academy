/*
 * Task3
 * 
 * Kirill Starovoitov
 */
package by.academy.homework1;

import java.util.Scanner;

/**
 * Implementation of task # 3 of Homework1. Output of the multiplication table
 * for one of digits from 1 to 10
 * 
 * @version 1.0 25 Nov 2022
 * @author Kirill Starovoiotov
 */
public class Task3 {

	/** The entering point to the program */
	public static void main(String[] args) {

		/*
		 * Variable for keeping digit for which the multiplication table will be
		 * outputted
		 */
		int digit;

		/* Making scanner for input a digit from console */
		Scanner scan = new Scanner(System.in);

		/*
		 * Algorithm of input a digit from console and checking if entered digit is in
		 * the correct range
		 */
		do {
			System.out.println("Enter a digit from 1 to 10");
			digit = scan.nextInt(); // Input a digit from console
		} while (!(digit <= 10 && digit >= 1)); // Checking

		scan.close(); // Closing scanner

		for (int i = 1; i <= 10; i++) {
			System.out.println(digit + " * " + i + " = " + digit * i); // Output the multiplication table
		}

	}

}
