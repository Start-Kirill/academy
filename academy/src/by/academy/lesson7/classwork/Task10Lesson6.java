package by.academy.lesson7.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10Lesson6 {

	public static void main(String[] args) {
		String string = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Pattern pattern = Pattern.compile("Java +\\d+");
		Matcher matcher = pattern.matcher(string);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}

}
