package by.academy.lesson7.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

//	static Pattern pattern = Pattern.compile("\\S+(\\s)?");

	public static void main(String[] args) {

		String string = " Hey      There!     How      Are you doing";
//		Matcher matcher = pattern.matcher(string);
//
//		while (matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
		System.out.println(string.trim().replaceAll("\\s+", " "));

	}

}
