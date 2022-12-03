package by.academy.lesson5.classwork;

import java.util.Arrays;

public class ArraysClasswork {

	public static void main(String[] args) {
		Task0();
		Task1();
		Task2();
		Task3();
		Task4();
	}

	static void Task0() {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		System.out.println(days[6]);

	}

	static void Task1() {
		double[] array = { 23.5, 2.9, -3.5, 4.6 };

		System.out.println(array[0]);

	}

	static void Task2() {
		String[][] doubleArray = new String[3][6];
		char letter = 'a';
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				doubleArray[i][j] = "" + letter + (j + 1);
			}
			letter++;
		}

		System.out.println(Arrays.deepToString(doubleArray));

	}

	static void Task3() {
		char[][] array = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'j' } };
		System.out.println(Arrays.deepToString(array));
	}

	static void Task4() {
		int[][] array = {{1, 8, 4, 6, 7, 4, 1, 43},{9, 3, 12, 6, 7, 4, 21, -45}, {-1, 3, 5, 66, 7, 16, 32, 6}, {87, 3, 15, 6, 7, 9, -45, 5}, {111, 343, 45, 6, 67, 3, 23, 34}};
		int[][] newArray = new int[5][2];
		System.out.println(Arrays.deepToString(array));
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
			System.arraycopy(array[i], 0, newArray[i], 0, 1);
			System.arraycopy(array[i], 7, newArray[i], 1, 1);
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.deepToString(newArray));
		
	}
	
	

}
