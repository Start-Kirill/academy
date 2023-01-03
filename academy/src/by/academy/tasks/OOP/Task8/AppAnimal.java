package by.academy.tasks.OOP.Task8;

import by.academy.tasks.OOP.Task8.Animals.Animal;
import by.academy.tasks.OOP.Task8.Animals.Cat;
import by.academy.tasks.OOP.Task8.Animals.Dog;
import by.academy.tasks.OOP.Task8.Animals.Horse;
import by.academy.tasks.OOP.Task8.People.Veterinarian;

public class AppAnimal {

	public static void main(String[] args) {
		Animal dog = new Dog("Meat", "Backyard");
		Animal cat = new Cat("Fish", "Home");
		Animal horse = new Horse("Hay", "Pasture");
		Animal[] animals = { dog, cat, horse };
		
		Veterinarian vet = new Veterinarian("Nokota", 35);
		
		for (Animal animal : animals) {
			vet.treatAnimal(animal);
			animal.makeNoise();
			animal.eat();
			animal.sleep();
		}

	}

}
