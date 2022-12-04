package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTasks {

	public static void main(String[] args) {
//		Task1();
//		Task2();
//		Task3();
//		Task4();
//		Task5();
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

	}

	static void Task1() {
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

	static void Task2() {
		int[] odd = new int[50];
		int temp = 0;
		for (int i = 0; i < odd.length; i++) {
			if (i == 0) {
				odd[i] = 1;
			} else {
				odd[i] = odd[i - 1] + 2;
			}

		}

		System.out.println(Arrays.toString(odd));

		/*
		 * Algorithm of bubble sorting
		 */
		for (int i = 0; i < odd.length; i++) {
			for (int j = i + 1; j < odd.length; j++) {
				if (odd[i] < odd[j]) {
					temp = odd[i];
					odd[i] = odd[j];
					odd[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(odd));
	}

	static void Task3() {
		int[] random = new int[15];
		Random rand = new Random();
		int numberEvenElements = 0;

		for (int i = 0; i < random.length; i++) {
			random[i] = rand.nextInt(10);

			if ((random[i] % 2 == 0) && (random[i] > 0)) {
				numberEvenElements++;
			}
		}

		System.out.println(Arrays.toString(random));
		System.out.println(numberEvenElements);

	}

	static void Task4() {
		int[] random = new int[8];
		Random rand = new Random();

		for (int i = 0; i < random.length; i++) {
			while (random[i] < 1) {
				random[i] = rand.nextInt(11);
			}
		}

		System.out.println(Arrays.toString(random));

		for (int i = 1; i < random.length; i += 2) {
			random[i] = 0;
		}

		System.out.println(Arrays.toString(random));
	}

	static void Task5() {
		int[] first = new int[5];
		int[] second = new int[5];
		Random rand = new Random();
		int sumFirst = 0;
		int sumSecond = 0;
		double averageFirst = 0;
		double averageSecond = 0;

		for (int i = 0; i < 5; i++) {
			first[i] = rand.nextInt(6);
			second[i] = rand.nextInt(6);
			sumFirst += first[i];
			sumSecond += second[i];
		}
		averageFirst = sumFirst / (double) first.length;
		averageSecond = sumSecond / (double) second.length;

		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));

		if (averageFirst > averageSecond) {
			System.out.println("The average of the first array is bigger than the second's");
		} else if (averageFirst < averageSecond) {
			System.out.println("The average of the second array is bigger than the first's");
		} else {
			System.out.println("The averages of the arrays are the same");
		}

	}

	static void Task6() {
		Random rand = new Random();
		int[] array = new int[4];

		for (int i = 0; i < 4; i++) {
			array[i] = rand.nextInt(10, 100);
		}

		System.out.println(Arrays.toString(array));

		if (isRaiseSequence(array)) {
			System.out.println("The sequence is strictly raising");
		} else {
			System.out.println("The sequence isn't strictly raising");
		}

	}

	static boolean isRaiseSequence(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i] || a[i - 1] == a[i]) {
				return false;
			}
		}
		return true;
	}

	static void Task7() {
		int[] array = new int[20];

		for (int i = 0; i < 20; i++) {
			if (i <= 1) {
				array[i] = i;
			} else {
				array[i] = array[i - 2] + array[i - 1];
			}
		}
		System.out.println(Arrays.toString(array));

	}

	static void Task8() {
		int[] array = new int[12];
		Random rand = new Random();
		int max = 0;
		int lastIndex = 0;

		for (int i = 0; i < 12; i++) {
			array[i] = rand.nextInt(-15, 16);

			if (i == 0) {
				max = array[i];
			} else if (array[i] > array[i - 1]) {
				max = array[i];
			}
		}

		for (int i = 11; i >= 0; i--) {
			if (array[i] == max) {
				lastIndex = i;
				break;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("The last index of " + max + " is " + lastIndex);

	}

	static void Task9() {
		int[] firstInt = new int[10];
		int[] secondInt = new int[10];
		double[] firstDouble = new double[10];
		Random rand = new Random();
		int count = 0;

		for (int i = 0; i < 10; i++) {
			firstInt[i] = rand.nextInt(1, 10);
			secondInt[i] = rand.nextInt(1, 10);
			firstDouble[i] = (double) firstInt[i] / (double) secondInt[i];

			if (firstDouble[i] % (int) firstDouble[i] == 0) {
				count++;
			}
		}

		System.out.println(Arrays.toString(firstInt));
		System.out.println(Arrays.toString(secondInt));
		System.out.println(Arrays.toString(firstDouble));
		System.out.println("The number of integers: " + count);

	}

	static void Task10() {
		int[] array = new int[11];
		int[] counters = new int[3]; // index 0: -1; index 1: 0, index 2: 1
		Random rand = new Random();
		int indexMax = 0;

		for (int i = 0; i < 11; i++) {
			array[i] = rand.nextInt(-1, 2);
			if (array[i] == -1) {
				counters[0]++;
			} else if (array[i] == 0) {
				counters[1]++;
			} else {
				counters[2]++;
			}
		}

		for (int i = 1; i < 3; i++) {
			if (array[i] > array[indexMax]) {
				indexMax = i;
			}
		}

		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(counters));
		Arrays.sort(counters);
//		System.out.println(Arrays.toString(counters));
		if (Arrays.binarySearch(counters, counters[2]) == 2) {
			System.out.println(indexMax - 1 + " is met the most frequently");
		}

	}

	static void Task11() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int positiveEven;
		int sumFirst = 0;
		int sumSecond = 0;

		do {
			System.out.print("Enter a positive even number: ");
			positiveEven = sc.nextInt();
		} while (positiveEven <= 0 || (positiveEven % 2) != 0);

		int[] array = new int[positiveEven];

		for (int i = 0; i < positiveEven; i++) {
			array[i] = rand.nextInt(-5, 6);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < (positiveEven / 2); i++) {
			sumFirst += Math.abs(array[i]);
			sumSecond += Math.abs(array[(positiveEven / 2) + i]);
		}

		System.out.println(sumFirst);
		System.out.println(sumSecond);

		if (sumFirst > sumSecond) {
			System.out.println("The first half of array is bigger");
		} else if (sumFirst < sumSecond) {
			System.out.println("The second half of array is bigger");
		} else {
			System.out.println("The halves of array are equal");
		}

	}

	static void Task12() {
		Random rand = new Random();
		int[] array = new int[12];
		int posCounter = 0;
		int negCounter = 0;

		for (int i = 0; i < 12; i++) {
			do {

				if (posCounter > 6) {
					posCounter--;
				}
				if (negCounter > 6) {
					negCounter--;
				}

				do {
					array[i] = rand.nextInt(-10, 10);
				} while (array[i] == 0);

				if (array[i] > 0) {
					posCounter++;
				} else if (array[i] < 0) {
					negCounter++;
				}
			} while (posCounter > 6 || negCounter > 6);
		}
		System.out.println(Arrays.toString(array));
		System.out.println(posCounter);
		System.out.println(negCounter);

	}

	static void Task13() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int n;
		int numberEven = 0;
		int[] arrayEven;
		int j = 0;

		do {
			System.out.print("Enter a number more than 3: ");
			n = sc.nextInt();
		} while (n <= 3);

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt(n + 1);
			if (array[i] % 2 == 0 && array[i] != 0) {
				numberEven++;
			}
		}

		System.out.println(Arrays.toString(array));

		if (numberEven != 0) {
			arrayEven = new int[numberEven];
			for (int i = 0; i < n; i++) {
				if (array[i] % 2 == 0 && array[i] != 0) {
					arrayEven[j] = array[i];
					j++;
				}
			}
			System.out.println(Arrays.toString(arrayEven));
		} else {
			System.out.println("There isn't even numbers");
		}

	}

	static void Task14() {
		Random rand = new Random();
		int[][] array = new int[8][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10, 100);
			}
		}

		System.out.println(Arrays.deepToString(array));
	}

	static void Task15() {
		Random rand = new Random();
		int[][] array = new int[5][8];
		int maxValue = -99;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] = rand.nextInt(-99, 100)) > maxValue) {
					maxValue = array[i][j];
				}
			}
		}

		System.out.println(Arrays.deepToString(array));
		System.out.println(maxValue);

	}

	static void Task16() {
		Random rand = new Random();
		int[][] array = new int[7][4];
		int[] mults = { 1, 1, 1, 1, 1, 1, 1 };
		int maxValue = 0;
		int indexMax = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(-5, 6);
			}
		}
		System.out.println(Arrays.deepToString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				mults[i] *= Math.abs(array[i][j]);
			}
			if (i > 0 && (Math.abs(mults[i]) > maxValue)) {
				maxValue = mults[i];
				indexMax = i;
			} else if (i == 0) {
				maxValue = mults[i];
				indexMax = i;
			}
		}
		System.out.println(Arrays.toString(mults));
		System.out.println("The index of the biggest result of multiplication of values of an string is " + indexMax);

	}

	static void Task17() {
		int[][] array = new int[6][7];
		Random rand = new Random();
		int temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(0, 10);
			}
		}

		System.out.println(Arrays.deepToString(array));

//		for (int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				for(int k = j + 1; k < array[i].length; k++) {
//					if(array[i][j] < array[i][k]) {
//						temp = array[i][j];
//						array[i][j] = array[i][k];
//						array[i][k] = temp;
//					}
//				}
//			}
//		}

		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
			temp = array[i][array[i].length - 1];
			array[i][array[i].length - 1] = array[i][0];
			array[i][0] = temp;
		}

		System.out.println(Arrays.deepToString(array));
	}

	static void Task18() {
		Random rand = new Random();
		String[][] table = new String[8][8];
		int a;
		int b;

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = "" + (i + 2) + " * " + (j + 2);
			}
//			System.out.println(Arrays.toString(table[i]));
		}

		for (int i = 0; i < 15; i++) {
			do {
				a = rand.nextInt(0, 8);
				b = rand.nextInt(0, 8);
			} while (table[a][b] == null || table[b][a] == null);

			System.out.println(table[a][b]);

			table[a][b] = null;
			table[b][a] = null;
		}
		
//		for (int i = 0; i < table.length; i++) {
//			System.out.println(Arrays.toString(table[i]));
//		}


	}

}
