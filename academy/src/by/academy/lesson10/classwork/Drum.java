package by.academy.lesson10.classwork;

public class Drum implements Instrument {
	private char size;

	public Drum() {
		super();
	}

	public Drum(char size) {
		super();
		this.size = size;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	@Override
	public void play() {
		System.out.println(this + " is playing");

	}

	@Override
	public String toString() {
		return "The drum";
	}

}
