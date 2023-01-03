/*
 * 
 */
package by.academy.lesson6.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
//		Task1();
//		Task2();
//		Task3();
//		Task4();
//		Task5();
//		Task6();
//		Task7();
//		Task8();
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		StringLengthSort compare = new StringLengthSort();

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		Arrays.sort(array, compare);

		System.out.println(Arrays.toString(array));
	}

	static void Task3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		double averageLength;
		int sum = 0;

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
			sum += array[i].length();
		}

		averageLength = (double) sum / (double) n;

		for (int i = 0; i < n; i++) {
			if (array[i].length() < averageLength) {
				System.out.println(array[i]);
			}
		}
	}

	static void Task4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		int repeator = 0;
		int minRepeat = 0;
		int indexMinRepeat = 0;

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];
		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				for (int k = 0; k < array[i].length(); k++) {
					if (array[i].charAt(j) == array[i].charAt(k) && j != k) {
						repeator++;
					}
				}
				if (repeator == 0) {
					num[i]++;
				} else {
					repeator = 0;
				}
			}
			if (i == 0) {
				minRepeat = num[i];
				indexMinRepeat = i;
			} else if (num[i] < minRepeat) {
				minRepeat = num[i];
				indexMinRepeat = i;
			}
		}

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(num));
		System.out.println(array[indexMinRepeat]);

	}

	static void Task5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		boolean isLat = true;
		int numbWord = 0;
		int numWordsEqual = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		Arrays.sort(vowels);
		int counterVowels = 0;
		int counterConsonant = 0;

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) >= 'A' && array[i].charAt(j) <= 'z') {
//					System.out.println(Arrays.binarySearch(vowels, Character.toLowerCase(array[i].charAt(j))));
					if (Arrays.binarySearch(vowels, Character.toLowerCase(array[i].charAt(j))) >= 0) {
						counterVowels++;
					} else {
						counterConsonant++;
					}
				} else {
					isLat = false;
				}
			}
			if (isLat) {
				numbWord++;
				if (counterVowels == counterConsonant) {
					numWordsEqual++;
				}
			}
			isLat = true;
			counterVowels = 0;
			counterConsonant = 0;
		}

		System.out.println(numbWord);
		System.out.println(numWordsEqual);

	}

	static void Task6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		boolean indicator = true;
		int index = -1;

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < array[i].length(); j++) {
				if (array[i].charAt(j) < array[i].charAt(j - 1)) {
					indicator = false;
					break;
				}
			}
			if (indicator == true) {
				index = i;
				break;
			} else {
				indicator = true;
			}
		}
		if (index >= 0) {
			System.out.println("The first word with strict growing order of letters is: " + array[index]);
		} else {
			System.out.println("There isn't word with strict growing order of letters in the array");
		}

	}

	static void Task7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		boolean indicator = true;
		int index = -1;

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				for (int k = 0; k < array[i].length(); k++) {
					if (k != j) {
						if (array[i].charAt(j) == array[i].charAt(k)) {
							indicator = false;
							break;
						}
					}
				}
				if (indicator == false) {
					break;
				}
			}
			if (indicator == true) {
				index = i;
				break;
			} else {
				indicator = true;
			}
		}

		if (index >= 0) {
			System.out.println("The first word with different letters is: " + array[index]);
		} else {
			System.out.println("There isn't word with different letters");
		}
	}

	static void Task8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
		int n;
		boolean indicator = true;
//		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] indexes = {-1, -1};

		do {
			n = sc.nextInt();
		} while (n < 1);

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0, k = array[i].length() - 1; j < array[i].length(); j++, k--) {
				if (array[i].charAt(j) != array[i].charAt(k) || !(Character.isDigit(array[i].charAt(j)))) {
					indicator = false;
					break;
				}
			}
			if (indicator == true) {
//				list.add(i);
				if(indexes[0] == -1) {
					indexes[0] = i;
				} else {
					indexes[1] = 1;
				}
//				if (list.size() > 1)
				if (indexes[1] > -1) {
					break;
				}
			} else {
				indicator = true;
			}
		}

//		if (list.size() > 1)
		if (indexes[1] > -1) {
//			System.out.println(array[list.get(1)]);
			System.out.println(array[indexes[1]]);
//		} else if (list.size() == 1)
		} else if (indexes[1] == -1) {
//			System.out.println(array[list.get(0)]);
			System.out.println(array[indexes[0]]);
		} else {
			System.out.println("There isn't numerical palindrome");
		}
	}
	//test
	
	

}
