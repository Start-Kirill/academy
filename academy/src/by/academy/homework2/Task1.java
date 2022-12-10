/*
 * Homework #2
 * Task 1
 * 
 * Kirill Starovoitov
 */
package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementation of Task # 1 of Homework # 2. Input two strings form console.
 * Finding out if inputted strings are strings with the same symbols in
 * different or the same order. Character case matters. Do not use sorting.
 * 
 * @version 1.0 07 Dec 2022
 * @author Kirill Starovoitov
 */
public class Task1 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Input two strings
		 */
		System.out.println("Enter the first string:");
		String wordOne = sc.next();

		System.out.println("Enter the second string:");
		String wordTwo = sc.next();

		System.out.println(compare(wordOne, wordTwo));

		sc.close();

	}

	/**
	 * The method for finding out whether strings have the same symbols in different
	 * or the same order or not.
	 * 
	 * @param wordOne the first string to be compared
	 * @param wordTwo the second string to be compared
	 * @return true if strings have the same symbols in different or the same order
	 *         otherwise false
	 */
	static boolean compare(String wordOne, String wordTwo) {

		/* Checking if lengths of strings is the same */
		if (wordOne.length() != wordTwo.length()) {
			return false;
		}

		/*
		 * array for storing the numbers of repetitions of symbols in the first string
		 */
		int[] firstRepetitions = new int[256];

		/*
		 * array for storing the numbers of repetitions of symbols in the first string
		 */
		int[] secondRepetitions = new int[256];

		/*
		 * Counting how many times each symbol in each string meets.
		 */
		for (int j = 0; j < wordOne.length(); j++) {
			firstRepetitions[wordOne.charAt(j)]++;
			secondRepetitions[wordTwo.charAt(j)]++;
		}

		/*
		 * Comparing whether arrays of counting repetitions are the same
		 */
		if (Arrays.compare(firstRepetitions, secondRepetitions) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
