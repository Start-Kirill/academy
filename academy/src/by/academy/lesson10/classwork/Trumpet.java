package by.academy.lesson10.classwork;

public class Trumpet implements Instrument {
	private double diameter;

	public Trumpet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trumpet(double diameter) {
		super();
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public void play() {
		System.out.println(this + " is playing");

	}

	@Override
	public String toString() {
		return "The trumpet";
	}

}
