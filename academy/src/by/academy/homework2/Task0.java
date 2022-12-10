/*
 * Homework # 2
 * Task 0
 * 
 * Kirill Satrovoitov
 */
package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implementation of Task # 0 of Homework #2. Completing of the program for
 * calculating the numbers pairs in the array whose difference equals the target
 * value. The program ask to enter the number of elements in array and the
 * target value from console at the first entering and values for array at the
 * second entering. The program will ask you repeat entering if you enter values
 * in incorrect range. Correct ranges for value follow: the number of element in
 * array in range [2;10^5], the target value in range (0;10^9). Each element of
 * array must be unique and be in range (0; 2^31 - 1).
 * 
 * @version 1.0 07 Dec 2022
 * @author Kirill Starovoitov
 */
public class Task0 {

	/**
	 * The method for calculating the numbers pairs in the array whose difference
	 * equals the target value.
	 * 
	 * @param k   the target value
	 * @param arr an array with values in which will be looking for pairs of values
	 *            whose difference is the target value
	 * @return the number of coincidences
	 */
	static int pairs(int k, int[] arr) {

		int pairsCount = 0; // counter of coincidences

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) { // excluding calculating elements with the same index
					if (arr[i] - arr[j] == k) {
						pairsCount++;
					}
				}
			}
		}
		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n; // Variable for storing the number of elements in array

		int k; // Variable for storing the target value

		/*
		 * Algorithm for checking if the input is correct. The input will repeat if it
		 * isn't
		 */
		do {
			System.out.println(
					"Enter the length of array(in range [2; 10^5)) and the target value (in range (0; 10^9) splitting them with whitespace:");

			String[] nk = scanner.nextLine().split(" "); // doing an array from String by splitting elements

			n = Integer.parseInt(nk[0]);

			k = Integer.parseInt(nk[1]);

		} while (n < 2 || n > Math.pow(10, 5) || k <= 0 || k >= Math.pow(10, 9)); // checking

		int[] arr = new int[n]; // Array for storing values for checking

		boolean indicator; // Variable for storing indicator testifying whether input is correct

		/*
		 * Algorithm for correct entering values of array. If it isn't correct input
		 * will be repeated
		 */
		do {
			indicator = true; // true by default

			System.out.println("Enter " + n
					+ " values of array splitting them with whitespaces. Each element of array must be unique in range (0; 2^31 - 1):");

			String[] arrItems = scanner.nextLine().split(" ");

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(arrItems[i]);
				if (arr[i] <= 0 || arr[i] == (Math.pow(2, 31) - 1)) { // the first checking
					indicator = false;
					System.out.println("At least one value is zero or negative or (2^31 - 1). Repeat please.");
					break;
				}
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) { // the second checking
						indicator = false;
						break;
					}
				}
				if (indicator == false) {
					System.out.println("Not all numbers are unique. Repeat please.");
					break;
				}
			}
		} while (!indicator);

		int result = pairs(k, arr); // calculating

		System.out.println("The number of pairs whose difference equals " + k + " is " + result);

		scanner.close();
	}

}
