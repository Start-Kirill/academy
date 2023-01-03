package by.academy.tasks.GenericsInnerClasses.Task6;

import by.academy.tasks.OOP.Task8.Animals.Cat;

public class App {

	public static void main(String[] args) {
		String str = "Hello";
		Cat cat = new Cat();
		double dab = 23.5;

		Gener<String, Cat, Double> gen = new Gener<>(str, cat, dab);

		gen.printNames();

	}

}
