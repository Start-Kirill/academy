package by.academy.tasks.OOP.Task8.Animals;

public class Dog extends Animal {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String food, String location) {
		super(food, location);
		// TODO Auto-generated constructor stub
	}

	public void makeNoise() {
		System.out.println(this.getClass() + " says gau-gau");
	}

	public void eat() {
		System.out.println(this.getClass() + " eats feed");
	}
}
