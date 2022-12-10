/*
 * Homework # 2
 * Task # 3
 * 
 * Kirill Starovoitov 
 */
package by.academy.homework2;

import java.util.Scanner;

/**
 * Implementation of Task # 3 of Homework # 2. Making up a word from the first
 * half of the first word and the second half of the second word. Words have to
 * have even number of letters.
 * 
 * @version 1.0 10 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class Task3 {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/* Variable for storing the first word */
		String wordOne;

		/* Variable for storing the second word */
		String wordTwo;

		/*
		 * Input the words form the console and checking whether they have even number
		 * of letter. Otherwise input is repeated
		 */
		do {
			System.out.print("Enter the first word with even number of letters: ");
			wordOne = sc.next();
		} while (wordOne.length() % 2 != 0);

		do {
			System.out.print("Enter the second word with even number of letters: ");
			wordTwo = sc.next();
		} while (wordTwo.length() % 2 != 0);

		/* Making the new word */
		String newWord = new String(wordOne.substring(0, wordOne.length() / 2)
				+ wordTwo.substring(wordTwo.length() / 2, wordTwo.length()));

		System.out.println(newWord);
		sc.close();
	}

}
