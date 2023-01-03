package by.academy.tasks.OOP.Task8.Animals;

public class Horse extends Animal {

	public Horse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horse(String food, String location) {
		super(food, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
		System.out.println(this.getClass() + " says egogog");
	}

	public void eat() {
		System.out.println(this.getClass() + " eats hay");
	}
}
