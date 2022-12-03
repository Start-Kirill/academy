package by.academy.lesson6.classwork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Task1();
	}

	static void Task1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n = sc.nextInt();
		String[] strings = new String[n];

		Comparator<String> lengthCompare = new StringLengthSort();

		for (int i = 0; i < n; i++) {
			strings[i] = sc.next();
		}

		Arrays.sort(strings, lengthCompare);

		System.out.println("The shortest string is: " + strings[0] + ". The length is " + strings[0].length()
				+ "\nThe longest string is: " + strings[n - 1] + ". The length is " + strings[n - 1].length());
		
	}
	
	static void Task2() {
		
	}

}
