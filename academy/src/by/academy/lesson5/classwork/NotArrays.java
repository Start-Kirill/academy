/*
 * 
 */
package by.academy.lesson5.classwork;

import java.util.Scanner;

public class NotArrays {

	public static void main(String[] args) {

//		Task1();
//		Task2();
//		Task3();
//		Task4();
//		Task6();
//		Task7();
//		Task8();
//		Task9();
//		Task10();
//		Task11();
//		Task12();
//		Task13();
//		Task14();
//		Task15();
//		Task16();
//		Task17();
//		Task18();
//		Task19();
//		Task20();
//		Task21();
//		Task22();
//		Task23();
//		Task24();
//		Task25();
		Task26();
//		Task27();
//		Task28();
//		Task29();
//		Task30();
//		Task31();

	}

	static void Task1() {
		for (int i = 10; i <= 20; i++) {
			System.out.println("Squated " + i + " = " + Math.pow(i, 2));
		}
	}

	static void Task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println(sum);

	}

	static void Task3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int sum = 1;

		for (int i = 1; i <= n; i++) {
			sum *= i;
		}

		System.out.println(sum);

	}

	static void Task4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick number of digits: ");
		int n = sc.nextInt();
		int digit = 0;
		int countNeg = 0;
		int countPos = 0;
		int countZero = 0;

		for (int i = 0; i <= n; i++) {
			System.out.println("Pick a digit: ");
			digit = sc.nextInt();
			if (digit < 0) {
				countNeg++;
			} else if (digit > 0) {
				countPos++;
			} else {
				countZero++;
			}
		}
		System.out.println("Negativ " + countNeg);
		System.out.println("Positive " + countPos);
		System.out.println("Zero " + countZero);
	}

	static void Task6() {
		Scanner sc = new Scanner(System.in);
		double percent = 0.03;
		System.out.println("Enter amount of money:");
		double amount = sc.nextDouble();
		System.out.println("Enter quantity years:");
		int n = sc.nextInt();

		while (n > 0) {
			amount += (amount * percent);
			n--;
		}

		System.out.println(amount);

	}

	static void Task7() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println(Integer.max(sc.nextInt(), sc.nextInt()));
		}
	}

	static void Task8() {
		for (int i = 20; i < 51; i++) {
			if (i % 3 == 0) {
				if (i % 5 != 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

	static void Task9() {
		for (int i = 35; i < 88; i++) {
			if ((i % 7) == 1 || (i % 7) == 2 || (i % 7) == 5) {
				System.out.print(i + " ");
			}
		}
	}

	static void Task10() {
		int sum = 0;
		for (int i = 1; i < 51; i++) {
			if ((i % 5) == 0 || (i % 7) == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	static void Task11() {
		for (int i = 10; i < 100; i++) {
			if (((i % 4) == 0) && ((i % 6) != 0)) {
				System.out.print(i + " ");
			}
		}
	}

	static void Task12() {
		int mult = 1;
		for (int i = 10; i < 100; i++) {
			if (((i % 2) != 0) && ((i % 13) == 0)) {
				mult *= i;
			}
		}
		System.out.println(mult);
	}

	static void Task13() {
		int sum = 0;
		for (int i = 100; i < 201; i++) {
			if ((i % 17) == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	static void Task14() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println(sum);
	}

	static void Task15() {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		System.out.print(Math.pow(a, b));
	}

	static void Task16() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of mowers: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of hours: ");
		double m = sc.nextDouble();
		double total = m + ((1.0 / 6.0) * n);

		System.out.println("total: " + total);

	}

	static void Task17() {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the height of " + (i + 1) + " student: ");
			sum += sc.nextDouble();

		}
		System.out.println("The avarage height is " + sum / n);
	}

	static void Task18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number: ");
		int n = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if ((i % 2) != 0 && (i % 3) != 0 && (i % 5) != 0) {
				count++;
			}
		}
		System.out.println(count);

	}

	static void Task19() {
		String number;
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				number = "" + i + j;
				if (Integer.parseInt(number) % (i * j) == 0) {
					System.out.println("The first number is: " + i + " The second number is: " + j);
				}
			}
		}
	}

	static void Task20() {
		String number1;
		String number2;
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				number1 = "" + i + j;
				number2 = "" + j + i;
				if (Integer.parseInt(number1) % 99 == 0 && Integer.parseInt(number2) % 49 == 0) {
					System.out.println("The first number is: " + i + " The second number is: " + j);
				}
			}
		}
	}

	static void Task21() {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("Eneter n:");
		int nSquared = (int) Math.pow(sc.nextInt(), 2);

		for (int i = 0; i <= 2 * nSquared; i += 2) {
			if (i == 0) {
				sum++;
			} else {
				sum += 1.0 / Math.pow(i, 2);
			}
//			System.out.println(sum);
		}
		System.out.println(sum);
	}

	static void Task22() {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("Eneter n:");
		long n = sc.nextLong();

		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
//			System.out.println(sum);
		}
		System.out.println(sum);

	}

	static void Task23() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += Math.pow(2, i);
//			System.out.println(sum);
		}
		System.out.println(sum);
	}

	static void Task24() {
		long mult = 1;
		int sumProgress = 0;
		for (int i = 2; i <= 10; i++) {
			sumProgress = i * (1 + i) / 2;
//			System.out.println(sumProgress);
			mult *= sumProgress;
//			System.out.println(mult);
		}
		System.out.println(mult);
	}

	static void Task25() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = sc.nextDouble();
		System.out.println("Enter n:");
		int n = sc.nextInt();
		double mult = a;

		for (int i = 1; i < n; i++) {
			mult *= (a + i);
//			System.out.println(mult);
		}
		System.out.println(mult);

	}

	static void Task26() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		double x = Math.toRadians(sc.nextDouble());
//		System.out.println(180.0 / Math.PI);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += Math.pow(Math.sin(x), i);
			System.out.println(sum);
		}

		System.out.println(sum);

	}

	static void Task27() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of money:");
		double amount = sc.nextDouble();
		System.out.println("Enter a ice-cream's cost:");
		double cost = sc.nextDouble();
		int count = 0;

		while (cost <= amount) {
			amount -= cost;
			count++;
		}
		System.out.println("The remainder of amount: " + amount + "\nThe number of eaten ice-creams: " + count);

	}

	static void Task28() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of credit: ");
		double credit = sc.nextDouble();
		System.out.print("Enter threshold of debt: ");
		double threshold = sc.nextDouble();
		int yearsCount = 0;

		while (credit < threshold) {
			credit += (credit * 0.2);
			yearsCount++;
//			System.out.println(credit);
		}

		System.out.println("In " + yearsCount + " years the debt will be more than " + threshold);

	}

	static void Task29() {
		int even = 2;

		while (even <= 100) {
			System.out.println(even);
			even += 2;
		}
	}
	
	static void Task30() {
		int odd = 1;
		int sum = 0;
		
		while (odd <= 99) {
			sum += odd;
//			System.out.println(sum);
			odd += 2;
//			System.out.println(odd);
		}
		System.out.println("The amount of all odd numbers from 1 to 99 is " + sum);
	}
	
	static void Task31() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of material: ");
		double length = sc.nextDouble();
		System.out.print("Enter the needed length: ");
		double needLength = sc.nextDouble();
		
		while (needLength < length) {
			length -= needLength;
			System.out.println("We cut " + needLength + " The remainder is " + length);
		}
		
		System.out.println("The length is less than needed: ");
	
	}

}
