/*
 * Task2
 * 
 * Kirill Starovoitov
 */
package by.academy.homework1;

import java.util.Scanner;

/**
 * Implementation of task #2 of homework1. Doing operations with data depending
 * on data's type.
 * 
 * @version 1.0 25 Nov 2022
 * @author Kirill Starovoitov
 */
public class Task2 {

	/** The entering point to the program */
	public static void main(String[] args) {

		/* Variable for keeping type of data in String format */
		String type;

		/* Variable for keeping data in String format */
		String data;

		/* Making scanner for reading and writing down data from console */
		Scanner scan = new Scanner(System.in);

		/* Input a type of data from console with ignoring register */
		System.out.println("Enter type of data[int, double, float, char, String]:");
		type = scan.next().toLowerCase();

		/* Input data from console */
		System.out.println("Enter data");
		data = scan.next();

		scan.close(); // closing scanner

		/*
		 * Checking if the type insn't null. Choosing appropriate option depending on
		 * entered type of data.
		 */
		if (type != null) {
			switch (type) {
			case "int":
				System.out.println("Remainder of division by 2: " + Integer.parseInt(data) % 2); // Output reminder of
																									// division by 2
				break;
			case "double":
				System.out.println("70% from " + data + ": " + Double.parseDouble(data) * 0.7); // Output 70% from the
																								// value
				break;
			case "float":
				System.out.println(data + " squared: " + Math.pow(Float.parseFloat(data), 2)); // Output the value
																								// squared
				break;
			case "char":
				System.out.println("The first symbol: " + data.charAt(0)); // Output the string's first symbol
				break;
			case "string":
				System.out.println("Hello " + data);
				break;
			default:
				System.out.println("Unsupported type");
				break;
			}
		} else {
			System.out.println("You didn't pick a type");
		}

	}

}
