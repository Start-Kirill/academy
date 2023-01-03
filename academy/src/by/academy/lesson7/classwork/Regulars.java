package by.academy.lesson7.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulars {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("c*ab");
		Matcher matcher = pattern.matcher("cab ccab cccab");
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
	
	

}
