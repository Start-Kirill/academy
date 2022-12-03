package by.academy.lesson4;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		Integer[] random = new Integer[15];
		int numberEvenElements = 0;

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10.0);

			if ((random[i] % 2 == 0) && (random[i] > 0)) {
				numberEvenElements++;
			}
		}

		System.out.println(Arrays.toString(random));
		System.out.println(numberEvenElements);

	}

}
