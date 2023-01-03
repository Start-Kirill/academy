package by.academy.tasks.OOP.Task7.vehicles;

import by.academy.tasks.OOP.Task7.details.Engine;
import by.academy.tasks.OOP.Task7.professions.Driver;

public class TestApp {

	public static void main(String[] args) {
		Driver driver = new Driver("Kirill", 29, "K.A.", 11);
		Engine engine = new Engine(1.6, "Lada");
		
		Car car = new Lorry("Lada", "econom", 3300, driver, engine, 5000);
		
		car.printInfo();
	}

}
