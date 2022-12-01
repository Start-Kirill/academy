/*
 * Cat
 * 
 * Kirill Starovoitov
 */
package by.academy.lesson2.classwork;

/**
 * Class Cat is implementation part 2 of Homework1. A cat has age, nickname,
 * money and initials. It might be a home animal or not. A cat might buy stuff.
 * 
 * @version 1.0 27 Nov 2022
 * @author Kirill Starovoitov
 */
public class Cat {

	/** Variable for storing age of a cat */
	private int age;

	/** Variable for storing a cat's nickname */
	private String nickname;

	/** Variable for storing amount of money a cat has */
	private double money;

	/** Variable for storing information if a cat is domestic */
	private boolean isHomeAnimal;

	/** Variable for storing the First symbol of a cat's nickname */
	private char initials;

	/** Class constructor without operations */
	public Cat() {
		super();
	}

	/** Class constructor that doing like setter for a cat's nickname */
	public Cat(String nickname) {
		this.nickname = nickname;
	}

	/** Getter for a cat's age */
	public int getAge() {
		return age;
	}

	/** Setter for a cat's money */
	public void setMoney(double money) {
		this.money = money;
	}

	/** Getter for a cat's money */
	public double getMoney() {
		return money;
	}

	/** Setter for a cat's initials */
	public void setInitials() {
		initials = nickname.charAt(0);
	}

	/** Getter for a cat's initials */
	public char getInitials() {
		return initials;
	}

	/**
	 * Setter for isHomeAnimal. In the case "true" a cat is domestic and vice versa
	 */
	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	/** Getter for isHomeAnimal */
	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	/** Calling this method raises the age by 1 */
	public void grow() {
		age++;
	}

	/** This method prompts a cat to eat */
	public void eat() {
		System.out.println("A cat is eating");
	}

	/** This method prompts a cat to sleep */
	public void sleep() {
		System.out.println("A cat is sleeping");
	}

	/** This method prompts a cat to walk */
	public void walk() {
		System.out.println("A cat is walking");
	}

	/**
	 * By this method a cat buys meal. If a cat doesn't have enough money a message
	 * outputs to console.
	 */
	public void buyMeal(double price) {

		/* Doing a transaction depending on if a cat has enough money */
		if (money < price) {
			System.out.println("You don't have enough money");
		} else {
			money -= price;
			System.out.println("You bought meal");
		}

	}

}
