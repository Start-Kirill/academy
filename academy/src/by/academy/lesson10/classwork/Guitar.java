package by.academy.lesson10.classwork;

public class Guitar implements Instrument {
	private int numberOfStrings;
//	private String name;

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public Guitar() {
		super();
	}

	public Guitar(int numberOfStrings) {
		super();
		this.numberOfStrings = numberOfStrings;
	}

	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	@Override
	public void play() {
		System.out.println(this + " is playing");
	}

	@Override
	public String toString() {
		return "The guitar";
	}


}
