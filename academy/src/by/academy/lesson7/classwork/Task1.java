package by.academy.lesson7.classwork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	
	static Pattern pattern = Pattern.compile("[!?.,;:]");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		Matcher matcher = pattern.matcher(string);

		
		int counter = 0;
		
		while (matcher.find()) {
			System.out.println(matcher.group());
			counter++;
		}
		
		System.out.println(counter);
		
	}

}
