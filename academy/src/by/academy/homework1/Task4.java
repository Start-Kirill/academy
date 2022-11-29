/*
 * Task4
 * 
 * Kirill Starovoiotv
 */
package by.academy.homework1;

/**
 * Implementation task # 4 of Homework1. Output to console a power of 2 till
 * result will be more 1 000 000
 * 
 * @version 1.0 26 Nov 2022
 * @author Kirill Starovoitov
 */
public class Task4 {

	/** The entering point to the program */
	public static void main(String[] args) {

		/* A variable for storing result of exponentiation */
		double powerTwo = 0;

		/* A variable for storing power of 2 */
		int power = 0;

		/*
		 * Algorithm of output results of exponentiation with evenly increasing power by
		 * 1 the number 2 till result will be more 1_000_000
		 */
		while (powerTwo < 1_000_000) {
			powerTwo = Math.pow(2, power); // Exponentiation "power" the number 2
			System.out.println("2 in power " + power + " equals " + (int) powerTwo);
			power++; // Increasing a power by 1
		}

	}

}
