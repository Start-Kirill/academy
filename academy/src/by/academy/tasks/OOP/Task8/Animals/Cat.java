package by.academy.tasks.OOP.Task8.Animals;

import java.io.Serializable;

public class Cat extends Animal implements Serializable{
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String food, String location) {
		super(food, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
		System.out.println(this.getClass() + " says myau - myay");
	}
	
	public void eat() {
		System.out.println(this.getClass() + " eats fish" );
	}
}
