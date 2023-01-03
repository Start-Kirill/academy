package by.academy.lesson7.classwork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTask3 {

	private static Pattern pattern = Pattern.compile("\\w+[\\s.,:!?)\";]");
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String string = sc.nextLine();
		Matcher matcher = pattern.matcher(string);
		
		while(matcher.find()) {
			System.out.print(matcher.group().charAt(matcher.group().length() - 2));
		}
	}

}
