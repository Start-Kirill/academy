/*
 * Homework #4. Task #1
 * 
 * Kirill Starovoitov
 */
package by.academy.homework4.Task1;

import java.util.Scanner;

/**
 * Testing class for task #1 Homework # 4
 * 
 */
public class TestApp {

	public final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String date;
		do {
			System.out.println("Enter a date in format dd-MM-yyyy");
			date = sc.next();
		} while (!(ValidationDate.validate(date)));

		CustomDate customDate = new CustomDate(date);

		System.out.println(customDate.getDayOfWeek());
		System.out.println(customDate.getDifferenceInDays(new CustomDate("06-01-2023")));

	}

}
