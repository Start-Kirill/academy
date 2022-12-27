package by.academy.homework3.deal;

public class Beer extends Product {

	private double volume;
	private String type;

	public Beer() {
		super();
	}

	public Beer(String name, double quantity, double price, double volume, String type) {
		super(name, quantity, price);
		this.volume = volume;
		this.type = type;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getVolume() {
		return volume;
	}

	public String getType() {
		return type;
	}

	@Override
	public double discount() {
		if (quantity > 6 && volume > 1.0) {
			return 0.9;
		}
		return 1;
	}

}
