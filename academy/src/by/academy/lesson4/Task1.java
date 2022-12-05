/*
 * 
 */
package by.academy.lesson4;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {

	public static void main(String[] args) {
		Integer[] odd = new Integer[50];
		
		for (int i = 0; i < odd.length; i++) {
			if (i == 0) {
				odd[i] = 1;
			} else {
				odd[i] = odd[i - 1] + 2;
			}

		}

		System.out.println(Arrays.toString(odd));
		Arrays.sort(odd, Comparator.reverseOrder());
		System.out.println(Arrays.toString(odd));
	}

}
