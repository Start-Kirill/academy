package by.academy.homework3.deal;

public abstract class Product {

	protected String name;
	protected double quantity;
	protected double price;

	public Product() {
		super();
	}

	public Product(String name, double quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public double calcPrice() {
		return price * quantity;
	}

	public abstract double discount();

	public double getFinalPrice() {
		return calcPrice() * discount();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
