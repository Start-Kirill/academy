package by.academy.tasks.OOP.Task7.vehicles;

import by.academy.tasks.OOP.Task7.details.Engine;
import by.academy.tasks.OOP.Task7.professions.Driver;

public class SportCar extends Car {
	private double limitedSpeed;

	public SportCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportCar(String brand, String level, double weight, Driver driver, Engine engine, double limitedSpeed) {
		super(brand, level, weight, driver, engine);
		this.limitedSpeed = limitedSpeed;
	}

	public double getLimitedSpeed() {
		return limitedSpeed;
	}

	public void setLimitedSpeed(double limitedSpeed) {
		this.limitedSpeed = limitedSpeed;
	}

	@Override
	public String toString() {
		return "SportCar [limitedSpeed=" + limitedSpeed + ", brand=" + brand + ", level=" + level + ", weight=" + weight
				+ ", driver=" + driver + ", engine=" + engine + "]";
	}

}
