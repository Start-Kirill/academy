package by.academy.lesson7.classwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmail {

	private static final Scanner sc = new Scanner(System.in);
	private static final Pattern pattern = Pattern.compile("[\\w.]+@[A-Za-z]+\\.[A-Za-z]{2,3}");

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		try {
			File file = new File("C:\\Users\\Ks\\git\\academy\\academy\\src\\by\\academy\\lesson7\\classwork\\Emails.txt");
			FileReader freader = new FileReader(file);
			BufferedReader reader = new BufferedReader(freader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				string.append(line + " ");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(string);

		Matcher matcher = pattern.matcher(string);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
