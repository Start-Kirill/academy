package by.academy.homework3.Task3;

public class TestValidationDate {

	public static void main(String[] args) {
		ValidationDate validator = new ValidationDate();
		
		validator.setDate("29/02/2028");
		System.out.println(validator.validate());
		validator.setDate("29-02-2028");
		System.out.println(validator.validate());

	}
}
