package by.academy.tasks.OOP.Task8.Animals;

public class Animal {

	protected String food;
	protected String location;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String food, String location) {
		super();
		this.food = food;
		this.location = location;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void makeNoise() {
		System.out.println(this.getClass() + " is sleeping");
	}
	
	public void eat() {
		System.out.println(this.getClass() + " is eating");
	}
	
	public void sleep() {
		System.out.println(this.getClass() + " is sleeping");
	}
	
	

}
