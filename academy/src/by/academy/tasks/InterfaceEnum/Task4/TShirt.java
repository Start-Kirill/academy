package by.academy.tasks.InterfaceEnum.Task4;

public class TShirt extends Clothes implements MenClothes, WomenClothes {

	public TShirt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TShirt(ClothesSizes size, double price, String color) {
		super(size, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void putOnWomen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void putOnMan() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "TShirt [size=" + size + ", price=" + price + ", color=" + color + "]";
	}

}
