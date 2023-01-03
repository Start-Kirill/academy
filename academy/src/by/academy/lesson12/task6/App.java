package by.academy.lesson12.task6;

import by.academy.homework3.deal.Beer;

public class App {

	public static void main(String[] args) {

		ThreeGeneric <String, Beer, Double> items = new ThreeGeneric <> ("Something", new Beer(), 2.0);
		
		items.getNameClass();

	}

}
