package by.academy.homework4.Task1;

public class CustomDate {
	private String date;
	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String date) {
		super();
		if (ValidationDate.validate(date)) {
			this.date = date;
			year = new Year();
			month = new Month();
			day = new Day();
		} else {
			System.out.println("Date is invalid");
		}
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		if (ValidationDate.validate(date)) {
			this.date = date;
			year = new Year();
			month = new Month();
			day = new Day();
		} else {
			System.out.println("Date is invalid");
		}
	}

	public Year getYear() {
		return year;
	}

	public Month getMonth() {
		return month;
	}

	public Day getDay() {
		return day;
	}

	/*
	 * Zeller's congruence
	 * https://en.wikipedia.org/wiki/Zeller's_congruence
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

	public int getDifference(CustomDate date) {
		int difference = 0;
		int[] quantDaysMonthUsually = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] quantDaysMonthLeap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int counter = 0;

		return difference;
	}

	public class Year {
		private String year;
		private int yearInt;

		public Year() {
			super();
			year = date.split("-")[2];
			yearInt = Integer.parseInt(year);
		}

		public String getYear() {
			return year;
		}

		public boolean isLeapYear() {
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

	public class Month {
		private String month;
		private int monthInt;

		public Month() {
			super();
			month = date.split("-")[1];
			monthInt = Integer.parseInt(month);
		}

		public String getMonth() {
			return month;
		}

	}

	public class Day {
		private String day;
		private int dayInt;

		public Day() {
			super();
			day = date.split("-")[0];
			dayInt = Integer.parseInt(day);
		}

		public String getDay() {
			return day;
		}

	}
}
