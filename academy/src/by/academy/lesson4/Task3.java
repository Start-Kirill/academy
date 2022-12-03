package by.academy.lesson4;

import java.util.Arrays;

public class Task3 {
	Integer[] random = new Integer[8];

	public static void main(String[] args) {
		Integer[] random = new Integer[8];
		int temp = 0;

		for (int i = 0; i < random.length; i++) {
			while (temp < 1) {
				temp = (int) (Math.random() * 10.0);
			}
			random[i] = temp;
			temp = 0;
		}
		
		System.out.println(Arrays.toString(random));
		
		for (int i = 1; i < random.length; i += 2) {
			random[i] = 0;
		}
		
		System.out.println(Arrays.toString(random));
	}

}
