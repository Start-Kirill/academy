package by.academy.lesson7.classwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class StringTest {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			String newString = "";
			StringBuilder stringBuild = new StringBuilder();
			File file = new File(
					"C:\\Users\\Ks\\git\\academy\\academy\\src\\by\\academy\\lesson7\\classwork\\The Hunger Games.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			char line;
			long m = System.currentTimeMillis();
			while ((line = (char) reader.read()) < 65535 && line > 0) {
				newString = newString + line;
//				System.out.println(line);
			}
			System.out.println(System.currentTimeMillis() - m);
			reader = new BufferedReader(new FileReader(file));
			m = System.currentTimeMillis();
			while ((line = (char) reader.read()) < 65535 && line > 0) {
				stringBuild.append(line);
//				System.out.println((int)line);
			}
			System.out.println(System.currentTimeMillis() - m);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

//		String[] strings = sc.nextLine().split(" ");
//		String newString = "";
//		StringBuilder stringBuild = new StringBuilder();
//
//		long m = System.currentTimeMillis();
//		for (int i = 0; i < strings.length; i++) {
//			newString = newString + strings[i];
//		}
//		System.out.println(newString);
//		System.out.println(System.currentTimeMillis() - m);
//
//		m = System.currentTimeMillis();
//		for (int i = 0; i < strings.length; i++) {
//			stringBuild.append(strings[i]);
//		}
//		System.out.println(stringBuild);
//		System.out.println(System.currentTimeMillis() - m);

	}

}
