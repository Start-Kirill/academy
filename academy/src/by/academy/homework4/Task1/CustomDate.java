/*
 * Homework #4. Task #1
 * 
 * Kirill Starovoitov
 */

package by.academy.homework4.Task1;

/**
 * Implementation of task#1 of Homework #4
 * 
 * Class for working with dates in format dd-MM-yyyy
 * 
 * @version 1.0 06 Jan 2023
 * @author Kirill Starovoitov
 *
 */
public class CustomDate {

	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String date) {
		super();
		year = new Year(date);
		month = new Month(date);
		day = new Day(date);
	}

	public void setDate(String date) {
		year = new Year(date);
		month = new Month(date);
		day = new Day(date);
	}

	public int getYear() {
		return year.yearInt;
	}

	public int getMonth() {
		return month.monthInt;
	}

	public int getDay() {
		return day.dayInt;
	}

	/**
	 * Method for finding out day of week in depends on date using zeller's
	 * congruence https://en.wikipedia.org/wiki/Zeller's_congruence
	 * 
	 * @return enum DaysOfWeek
	 */
	public DaysOfWeek getDayOfWeek() {
		int h;
		if (month.monthInt < 3) {
			h = (day.dayInt + (int) (13 * (month.monthInt + 12 + 1) / 5) + (year.yearInt - 1)
					+ (int) ((year.yearInt - 1) / 4) - (int) ((year.yearInt - 1) / 100)
					+ (int) ((year.yearInt - 1) / 400)) % 7;
		} else {
			h = (day.dayInt + (int) (13 * (month.monthInt + 1) / 5) + (year.yearInt - 1)
					+ (int) ((year.yearInt - 1) / 4) - (int) ((year.yearInt - 1) / 100)
					+ (int) ((year.yearInt - 1) / 400)) % 7;
		}

		switch (h) {
		case 0:
			return DaysOfWeek.SATURDAY;
		case 1:
			return DaysOfWeek.SUNDAY;
		case 2:
			return DaysOfWeek.MONDAY;
		case 3:
			return DaysOfWeek.TUESDAY;
		case 4:
			return DaysOfWeek.WEDNESDAY;
		case 5:
			return DaysOfWeek.THURSDAY;
		case 6:
			return DaysOfWeek.FRIDAY;
		default:
			return null;
		}

	}

	/**
	 * Method for finding quantity of days between two dates including the first day
	 * and excluding the last day.
	 * 
	 * @param date to be compared
	 * @return int number of days
	 */
	public int getDifferenceInDays(CustomDate date) {
		if (year.yearInt == date.year.yearInt) {
			return Math.abs(getDayOfYear() - date.getDayOfYear());
		}
		return calcDays(date);
	}

	/**
	 * Supporting method for getDifferenceDays. It calculates number of days between
	 * two dates if their years don't equal
	 * 
	 * @param date
	 * @return int number of days
	 */
	private int calcDays(CustomDate date) {
		int days = 0;
		days = (Math.abs(year.yearInt - date.year.yearInt) - 1) * 365;
		if (year.yearInt > date.year.yearInt) {
			for (int i = date.year.yearInt + 1; i < year.yearInt; i++) {
				if (isLeapYear(i)) {
					days += 1;
				}
			}
			days += getDayOfYear();
			if (date.isLeapYear()) {
				days += 366 - date.getDayOfYear();
			} else {
				days += 365 - date.getDayOfYear();
			}
		} else {
			for (int i = year.yearInt + 1; i < date.year.yearInt; i++) {
				if (isLeapYear(i)) {
					days += 1;
				}
			}
			days += date.getDayOfYear();
			if (isLeapYear()) {
				days += 366 - getDayOfYear();
			} else {
				days += 365 - getDayOfYear();
			}
		}
		return days;
	}

	/**
	 * Method defines the number of day in year
	 * 
	 * @return the number of day in year
	 */
	public int getDayOfYear() {
		int[] quantDaysMonthUsually = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] quantDaysMonthLeap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int numberDay = 0;
		if (isLeapYear()) {
			for (int i = 1; i < month.monthInt; i++) {
				numberDay += quantDaysMonthLeap[i - 1];
			}
		} else {
			for (int i = 1; i < month.monthInt; i++) {
				numberDay += quantDaysMonthUsually[i - 1];
			}
		}

		return numberDay + day.dayInt;
	}

	public boolean isLeapYear() {
		return isLeapYear(year.yearInt);
	}

	/**
	 * Method defines if a year is leap
	 * 
	 * @param yearInt
	 * @return true if a year is leap otherwise false
	 */
	static boolean isLeapYear(int yearInt) {
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

	private class Year {
		int yearInt;

		Year(String date) {
			super();
			yearInt = Integer.parseInt(date.split("-")[2]);
		}
	}

	private class Month {
		int monthInt;

		Month(String date) {
			super();
			monthInt = Integer.parseInt(date.split("-")[1]);
		}
	}

	private class Day {
		int dayInt;

		Day(String date) {
			super();
			dayInt = Integer.parseInt(date.split("-")[0]);
		}
	}
}
