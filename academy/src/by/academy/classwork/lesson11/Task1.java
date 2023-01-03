package by.academy.classwork.lesson11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Task1 {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1993, 1, 22);
		LocalDate now = LocalDate.now();
		int year = dateOfBirth.getDayOfYear();
		Month month = dateOfBirth.getMonth();
		DayOfWeek day = dateOfBirth.getDayOfWeek();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		System.out.println(dateOfBirth.isAfter(now));
		System.out.println(dateOfBirth.isBefore(now));
		
		
	}

}
