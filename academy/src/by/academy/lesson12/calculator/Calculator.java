package by.academy.lesson12.calculator;

public class Calculator {

	public static <T extends Number, V extends Number> double sum(T numberOne, V numberTwo) {

		return numberOne.doubleValue() + numberTwo.doubleValue();
	}

	public static <T extends Number, V extends Number> double multiply(T numberOne, V numberTwo) {

		return numberOne.doubleValue() * numberTwo.doubleValue();
	}

	public static <T extends Number, V extends Number> double divide(T numberOne, V numberTwo) {

		return numberOne.doubleValue() / numberTwo.doubleValue();
	}

	public static <T extends Number, V extends Number> double substraction(T numberOne, V numberTwo) {

		return numberOne.doubleValue() - numberTwo.doubleValue();
	}

}
