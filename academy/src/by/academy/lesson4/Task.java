package by.academy.lesson4;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		int[] even = new int[10];

		for (int i = 0; i < even.length; i++) {
			if (i == 0) {
				even[i] = 2;
			} else {
				even[i] = even[i - 1] + 2;
			}

		}

		for (int i = 0; i < even.length; i++) {

			System.out.print(even[i] + " ");

			if (i == even.length - 1) {
				System.out.println();
			}
		}

		for (int i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}

	}

}
