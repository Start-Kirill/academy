/*
 * Homework #2
 * Task #2
 * 
 * Kirill Starovoitov
 */
package by.academy.homework2;

import java.util.Scanner;

/**
 * Implementation of Task # 2 of Homework # 2. Searching a word with minimum
 * number of unique symbols among words inputted from the console.
 * 
 * @version 1.0 07 Dec 2022
 * @author Kirill Starovoitov
 */
public class Task2 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter words splitting them with whitespaces");
		String[] words = sc.nextLine().split(" ");

		System.out.println("The first word with the minimum number of different symbols is " + find(words));

		sc.close();

	}

	/**
	 * The method for finding out a word with minimum number of unique symbols among
	 * array of words.
	 * 
	 * @param words words array to be searched
	 * @return String with minimum number of unique symbols
	 */
	static String find(String[] words) {
		/*
		 * Array for storing the information how many time each symbol meets in a word
		 */
		int[] symbolRepeat = new int[256];

		/* Index of word with minimum number of unique symbol in the array */
		int indexMin = 0;

		/*
		 * Variable for storing the number of unique symbols in each word for comparing
		 * it with minimum value
		 */
		int tempCounter = 0;

		/*
		 * Variable for storing the minimum number of symbols of word among all words in
		 * array
		 */
		int counterMin = Integer.MAX_VALUE;

		/*
		 * Algorithm for searching an index of a word with minimum number of unique
		 * symbols among array of words
		 */
		for (int i = 0; i < words.length; i++) {
			tempCounter = 0;
			for (int j = 0; j < words[i].length(); j++) {
				symbolRepeat[words[i].charAt(j)]++;
			}
			for (int j = 0; j < symbolRepeat.length; j++) {
				if (symbolRepeat[j] > 0) {
					tempCounter++;
				}
				symbolRepeat[j] = 0;
			}
			if (tempCounter < counterMin) {
				counterMin = tempCounter;
				indexMin = i;
			}
		}

		return words[indexMin];
	}

}
