package by.academy.tasks.InterfaceEnum.Task4;

public class Skirt extends Clothes implements WomenClothes {

	public Skirt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skirt(ClothesSizes size, double price, String color) {
		super(size, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void putOnWomen() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Skirt [size=" + size + ", price=" + price + ", color=" + color + "]";
	}

}
