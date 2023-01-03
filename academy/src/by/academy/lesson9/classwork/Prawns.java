package by.academy.lesson9.classwork;

public class Prawns extends Product {
	private char size;

	public Prawns() {
		super();
	}

	public Prawns(String name, double price, double quantity, char size) {
		super(name, price, quantity);
		this.size = size;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
}
