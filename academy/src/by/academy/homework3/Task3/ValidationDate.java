/*
 * Homework #3 Task #1
 * 
 * Kirill Starovoitov
 */
package by.academy.homework3.Task3;

import java.util.regex.Pattern;

/**
 * Implementation of Task # 3 of Homework # 3. Class for date's validation in
 * formats dd/MM/yyyy or dd-MM-yyyy
 * 
 * @version 1.0 27 Dec 2022
 * @author Kirill Starovoitov
 *
 */
public class ValidationDate {

	private char divider;

	private String date;

	public ValidationDate() {
		super();
	}

	public ValidationDate(String date) {
		super();
		this.date = date;
		if (validate()) {
			this.divider = date.charAt(2);
		}

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public char getDivider() {
		return divider;
	}

	public void setDivider() {
		if (validate()) {
			this.divider = date.charAt(2);
		} else {
			System.out.println("Date is invalid");
		}
	}

	/**
	 * Method for validation a date in String format
	 * 
	 * @return true if a date is valid otherwise false
	 */
	public boolean validate() {

		if (date.length() != 10) {
			return false;
		}

		String[] dividedDate = date.split("/|-");

		if (dividedDate.length != 3) {
			return false;
		}

		/*
		 * Checking if a day is valid
		 */
		if (!(Pattern.matches("[0-2][1-9]|31|30|10|20", dividedDate[0]))) {
			return false;
		}

		/*
		 * Checking if a month is valid
		 */
		if (!(Pattern.matches("0[1-9]|1[0-2]", dividedDate[1]))) {
			return false;
		}

		/*
		 * Checking if a year is valid
		 */
		if (!(Pattern.matches("[1-2]\\d{3}", dividedDate[2]))) {
			return false;
		}

		/*
		 * Checking if a day, a month and a year is valid in particular cases
		 */
		if (!(validateDayMonth(dividedDate[0], dividedDate[1], dividedDate[2]))) {
			return false;
		}

		return true;
	}

	/**
	 * Method for checking is day, a month and a year is valid in particular cases
	 * 
	 * @param day   day of month in String
	 * @param month month in String
	 * @param year  year in String
	 * @return true if is valid otherwise false
	 */
	private boolean validateDayMonth(String day, String month, String year) {

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

	/**
	 * Method for checking if a year is leap
	 * 
	 * @param year year in String
	 * @return true if year is leap otherwise false
	 */
	private boolean isIntercalaryYear(String year) {
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
