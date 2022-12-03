package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Task 1
		int a = 2123000;
		int b = 100;
		int c = 234;

		int result = a / b * c;
		System.out.println(result);

		// Task 2
		int i = 3;
		int j = 4;
		int k = i * i + j * j;
		System.out.println(i + " * 3 + " + j + " * 4 = " + k);

		// Task 3
		String month = "November";
		switch (month) {
		case "January":
			System.out.println(month + ". Number of month is 1");
			break;
		case "Febrary":
			System.out.println(month + ". Number of month is 2");
			break;
		case "March":
			System.out.println(month + ". Number of month is 3");
			break;
		case "April":
			System.out.println(month + ". Number of month is 4");
			break;
		case "May":
			System.out.println(month + ". Number of month is 5");
			break;
		case "June":
			System.out.println(month + ". Number of month is 6");
			break;
		case "July":
			System.out.println(month + ". Number of month is 7");
			break;
		case "August":
			System.out.println(month + ". Number of month is 8");
			break;
		case "September":
			System.out.println(month + ". Number of month is 9");
			break;
		case "October":
			System.out.println(month + ". Number of month is 10");
			break;
		case "November":
			System.out.println(month + ". Number of month is 11");
			break;
		case "December":
			System.out.println(month + ". Number of month is 12");
			break;
		default:
			System.out.println("There is not approriate month");
			break;
		}

		// Task 4
		int num = 1234;
		if (num % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}

		// Task 4/1
		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int days;
		int d;
		int week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		hour = (m - min) / 60;
		h = hour % 24;
		days = (hour - h) / 24;
		d = days % 7;
		week = (days - d) / 7;
		System.out.println(week + " weeks " + days + " days " + h + " hours " + min + " minutes " + sec + " seconds ");

		// Task 5
		int theFirst;
		int theSecond;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first integer: ");
		theFirst = scan.nextInt();

		System.out.println("Enter the second integer: ");
		theSecond = scan.nextInt();

		if (theFirst > theSecond) {
			System.out.println("The first is the bigest number, the second is the least one. The average is "
					+ (double) (theFirst + theSecond) / 2.0);
		} else if (theSecond < theFirst) {
			System.out.println("The second is the bigest number, the first is the least one. The average is "
					+ (double) (theFirst + theSecond) / 2.0);
		} else {
			System.out.println("The first equals the second. The average is " + (double) (theFirst + theSecond) / 2.0);
		}
		
		scan.close();

	}
}
