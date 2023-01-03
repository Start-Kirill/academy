package by.academy.tasks.GenericsInnerClasses.Task8;

public class App {

	public static void main(String[] args) {
		Integer[] arrayInt = { 5, 8, 9, 1, 4, 23, 3 };
		Double[] arrayDouble = {1.5, 5.6, 7.8};

		MinMax minMax = new MinMax<>(arrayDouble);
		System.out.println(minMax.getMax());
		System.out.println(minMax.getMin());
	}
}
