package by.academy.lesson8.classwork;

public class Phone {

	private long number;
	private double weight;
	private String model;

	public Phone() {
		super();
	}

	public Phone(long number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone(long number, double weight, String model) {
		this(number, model);
		this.weight = weight;
	}

	public long getNumber() {
		return number;
	}

	public double getWeight() {
		return weight;
	}

	public String getModel() {
		return model;
	}

	public void receiveCall(String name) {
		System.out.println(name + " is calling");
	}

	public void receiveCall(String name, long number) {
		System.out.println(name + " is calling. Number is " + number);
	}

	public void sendMessage(long... numbers) {
		for (long number : numbers) {
			System.out.println("Sending a message to " + number);
		}
	}

	public String toString() {
		return "Model is " + model + ". Weight is " + weight + ". Number is " + number;
	}

}
