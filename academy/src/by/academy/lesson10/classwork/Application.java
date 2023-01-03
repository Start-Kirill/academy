package by.academy.lesson10.classwork;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(1));
		}
//		Printable[] items = new Printable[5];
//
//		items[0] = new Book("Chipolino");
//		items[1] = new Book("Kolobok");
//		items[2] = new Magazine("Hustler");
//		items[3] = new Magazine("Garden");
//		items[4] = new Magazine("TopGear");
//
//		for (Printable item : items) {
//			item.print();
//		}
//
//		System.out.println();
//		Magazine.printMagazine(items);
//
//		System.out.println();
//		Book.printBook(items);

	}

}
