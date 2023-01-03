package by.academy.tasks.OOP.Task8.People;

import by.academy.tasks.OOP.Task2Person.Person;
import by.academy.tasks.OOP.Task8.Animals.Animal;

public class Veterinarian extends Person {

	public Veterinarian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinarian(String fullName, int age) {
		super(fullName, age);
		// TODO Auto-generated constructor stub
	}
	
	public void treatAnimal(Animal animal) {
		System.out.println(animal.getFood());
		System.out.println(animal.getLocation());
	}
}
