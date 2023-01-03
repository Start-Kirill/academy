/*
 * Application
 * 
 * Kirill Starovoiotov 
 */
package by.academy.lesson2.classwork;

/**
 * This class is the main class of program.
 * 
 * @version 1.0 27 Nov 2022
 * @author Kirill Starovoitov
 */
public class Application {

	/** The method main is the entering point to the program */
	public static void main(String[] args) {

		/* Making the first object cat without nickname */
		Cat theFirst = new Cat();

		/* Making the second object cat with nickname */
		Cat theSecond = new Cat("Tom");

		/* Doing actions with the second cat */
		theSecond.eat();
		theSecond.sleep();
		theSecond.walk();

		/* Increasing age of the first cat by 3 */
		for (int i = 0; i < 3; i++) {
			theFirst.grow();
		}

		System.out.println(theFirst.getAge()); // Output age of the first cat
		
		System.out.println(theSecond);
	}

}
