package by.academy.lesson2.classwork;

public class Application {

	public static void main(String[] args) {
		Cat theFirst = new Cat();
		Cat theSecond = new Cat("Volodya");

		for (int i = 0; i < 3; i++) {
			theFirst.grow();
		}

		theSecond.eat();
		theSecond.sleep();
		theSecond.walk();

		System.out.println(theFirst.age);

	}

}
