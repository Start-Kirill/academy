package by.academy.lesson9.classwork;

public class Lidskoe extends Beer {
	private String veriety;

	public Lidskoe() {
		super();
	}

	public Lidskoe(String name, double price, double quantity, double volume, String veriety) {
		super(name, price, quantity, volume);
		this.veriety = veriety;
	}

	public String getVeriety() {
		return veriety;
	}

	public void setSort(String veriety) {
		this.veriety = veriety;
	}
}
