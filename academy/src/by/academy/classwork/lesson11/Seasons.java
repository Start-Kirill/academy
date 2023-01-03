package by.academy.classwork.lesson11;

public enum Seasons {

	WINTER(-10.5), SPRING(15), SUMMER(27), AUTUAMN(3);

	double temprature;

	private Seasons(double temprature) {
		this.temprature = temprature;
	}

	public double getTemprature() {
		return temprature;
	}

}
