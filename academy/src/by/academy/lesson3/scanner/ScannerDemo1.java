package by.academy.lesson3.scanner;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Pick string: ");
		String str = scanner.nextLine();
		
		scanner.close();

	}

}
