package by.academy.classwork.lesson11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task2 {

	public static void main(String[] args) {

		String[] holidays = { "01-01-2022", "02-01-2022", "07-01-2022", "08-03-2022", "01-05-2022", "03-05-2022",
				"09-05-2022", "03-07-2022", "07-11-2022", "25-12-2022" };

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
		
		for (String date : holidays) {
			LocalDate holiday = LocalDate.parse(date, formatter);
			System.out.println(holiday);
		}

	}

}
