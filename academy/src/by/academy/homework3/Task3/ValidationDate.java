/*
 * Homework #3 Task #1
 * 
 * Kirill Starovoitov
 */
package by.academy.homework3.Task3;

import java.util.regex.Pattern;

/**
 * Implementation of Task # 3 of Homework # 3. Class for date's validation
 * 
 * @version 1.0 27 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class ValidationDate {

	public static boolean validate(String date) {

		if (date.length() != 10) {
			return false;
		}

		String[] dividedDate = date.split("/|-");

		if (dividedDate.length != 3) {
			return false;
		}

		if (!(Pattern.matches("[0-2][1-9]|31|30|10|20", dividedDate[0]))) {
			return false;
		}

		if (!(Pattern.matches("0[1-9]|1[0-2]", dividedDate[1]))) {
			return false;
		}

		if (!(Pattern.matches("[1-2]\\d{3}", dividedDate[2]))) {
			return false;
		}

		if (!(validateDayMonth(dividedDate[0], dividedDate[1], dividedDate[2]))) {
			return false;
		}

		return true;
	}
	
	private static boolean validateDayMonth(String day, String month, String year) {

		String dayMonth = new String(day + month);

		if (isIntercalaryYear(year)) {
			if (Pattern.matches("3002|3102|3104|3106|3109|3111", dayMonth)) {
				return false;
			}
		} else {
			if (Pattern.matches("2902|3002|3102|3104|3106|3109|3111", dayMonth)) {
				return false;
			}
		}

		return true;
	}

	private static boolean isIntercalaryYear(String year) {
		int yearInt = Integer.parseInt(year);

		if (yearInt % 4 == 0) {
			if (yearInt % 100 == 0) {
				if (!(yearInt % 400 == 0)) {
					return false;
				}
			}
			return true;
		}

		return false;
	}
}
