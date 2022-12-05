/*
 * 
 */
package by.academy.lesson6.classwork;

import java.util.Arrays;

public class CustomSorting {

	public static void main(String[] args) {

		BubbleSortTask();

	}

	static void BubbleSortTask() {
		char[] symbols = { 'a', '4', '+', 'e', 'c', 'y', 'u', 'm', '5', 'n', 'a' };
		char temp = 0;
		for (int i = 0; i < symbols.length; i++) {
			for (int j = i + 1; j < symbols.length; j++) {
				if (symbols[i] < symbols[j]) {
					temp = symbols[i];
					symbols[i] = symbols[j];
					symbols[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(symbols));
	}

}
