package by.academy.homework3.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task4 {

	private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

	public static void main(String[] args) {
		Date date;
		try {
			date = formatter.parse("22/02/2020");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
