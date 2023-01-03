package by.academy.tasks.OOP.Task7.vehicles;

import by.academy.tasks.OOP.Task7.details.Engine;
import by.academy.tasks.OOP.Task7.professions.Driver;

public class Car {
	protected String brand;
	protected String level;
	protected double weight;
	protected Driver driver;
	protected Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String level, double weight, Driver driver, Engine engine) {
		super();
		this.brand = brand;
		this.level = level;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		System.out.println("Let's go");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
	
	public void turnRight() {
		System.out.println("Turning right");
	}
	
	public void turnLeft() {
		System.out.println("Turning left");
	}
	
	public void printInfo() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", level=" + level + ", weight=" + weight + ", driver=" + driver + ", engine="
				+ engine + "]";
	}
	

}
