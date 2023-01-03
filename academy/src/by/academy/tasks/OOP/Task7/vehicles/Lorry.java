package by.academy.tasks.OOP.Task7.vehicles;

import by.academy.tasks.OOP.Task7.details.Engine;
import by.academy.tasks.OOP.Task7.professions.Driver;

public class Lorry extends Car{
	private double loadCapacity;

	public Lorry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lorry(String brand, String level, double weight, Driver driver, Engine engine, double loadCapacity) {
		super(brand, level, weight, driver, engine);
		this.loadCapacity = loadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		return "Lorry [loadCapacity=" + loadCapacity + ", brand=" + brand + ", level=" + level + ", weight=" + weight
				+ ", driver=" + driver + ", engine=" + engine + "]";
	}
	
	
	
	
}
