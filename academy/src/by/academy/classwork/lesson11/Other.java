package by.academy.classwork.lesson11;

import java.util.Scanner;

import by.academy.lesson6.classwork.Strings;
import by.academy.lesson6.classwork.StringsClasswork;

public class Other {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0;
		System.out.println("Enter n:");
		
			if (sc.hasNextInt()) {
				n = sc.nextInt();
			}
			
	System.out.println(n);
	}
}
