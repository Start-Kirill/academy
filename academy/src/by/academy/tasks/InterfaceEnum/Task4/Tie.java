package by.academy.tasks.InterfaceEnum.Task4;

public class Tie extends Clothes implements MenClothes {

	public Tie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tie(ClothesSizes size, double price, String color) {
		super(size, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void putOnMan() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Tie [size=" + size + ", price=" + price + ", color=" + color + "]";
	}

}
