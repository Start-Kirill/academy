package by.academy.lesson7.classwork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {

	static private Pattern pattern = Pattern.compile("[a-zA-z]+[\\s!.;:?)]");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		Matcher matcher = pattern.matcher(string);

		int counter = 0;

		while (matcher.find()) {
			counter++;
			System.out.println(matcher.group());
		}

		System.out.println(counter);
		sc.close();
	}

}
