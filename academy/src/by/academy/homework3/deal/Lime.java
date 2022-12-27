package by.academy.homework3.deal;

public class Lime extends Product {

	private char size;
	private int limeAge; // age of limes in days

	public Lime() {
		super();
	}

	public Lime(String name, double quantity, double price, char size, int limeAge) {
		super(name, quantity, price);
		this.size = size;
		this.limeAge = limeAge;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public int getLimeAge() {
		return limeAge;
	}

	public void setLimeAge(int limeAge) {
		this.limeAge = limeAge;
	}
	
	@Override
	public double discount() {
		if (limeAge > 100) {
			return 0.8;
		}
		return 1;
	}

}