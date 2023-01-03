package by.academy.tasks.OOP.Task5Recursion;

public class ExmapleRecursion {

	private int numberOne;
	private int numberTwo;

	public ExmapleRecursion() {
		super();
	}

	public ExmapleRecursion(int numberOne, int numberTwo) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public double getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public void printOrder() {
		if (numberOne <= numberTwo) {
			if (numberOne == numberTwo) {
				System.out.println(numberOne);
				return;
			}
			System.out.println(numberOne);
			numberOne += 1;

		}
		if (numberOne >= numberTwo) {
			if (numberOne == numberTwo) {
				System.out.println(numberOne);
				return;
			}
			System.out.println(numberOne);
			numberOne -= 1;
		}

		printOrder();
	}

//	private void print(int number) {
//		System.out.println(number);
//		print(number + 1);
//		if (number == numberTwo) {
//			return;
//		}
//	}
}
