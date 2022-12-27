package by.academy.homework3.deal;

public class Prawns extends Product {

	private String variety;
	private char size;

	public Prawns() {
		super();
	}

	public Prawns(String name, double quantity, double price, String variety, char size) {
		super(name, quantity, price);
		this.variety = variety;
		this.size = size;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getVariety() {
		return variety;
	}

	public char getSize() {
		return size;
	}
	
	@Override
	public double discount() {
		if (quantity > 2) {
			return 0.8;
		}
		return 1;
	}
}
