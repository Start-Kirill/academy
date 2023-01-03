package by.academy.tasks.InterfaceEnum.Task4;

public abstract class Clothes {
	protected ClothesSizes size;
	protected double price;
	protected String color;

	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clothes(ClothesSizes size, double price, String color) {
		super();
		this.size = size;
		this.price = price;
		this.color = color;
	}

	public ClothesSizes getSize() {
		return size;
	}

	public void setSize(ClothesSizes size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Clothes [size=" + size + ", price=" + price + ", color=" + color + "]";
	}

}
