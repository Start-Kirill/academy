package by.academy.lesson9.classwork;

import java.io.Serializable;

public class Beer extends Product implements Serializable {
	protected double volume;

	public Beer() {
		super();
	}

	public Beer(String name, double price, double quantity, double volume) {
		super(name, price, quantity);
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

}
