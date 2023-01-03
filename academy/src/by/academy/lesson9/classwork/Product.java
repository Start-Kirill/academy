package by.academy.lesson9.classwork;

public class Product {
	protected String name;
	protected double price;
	protected double quantity;

	public Product() {
		super();
	}

	public Product(String name, double price, double quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double calcPrice() {
		return price * quantity;
	}

	public double discount() {
		return 1;
	}
	
	public String toString() {
		return "name = " + name;
	}

}
