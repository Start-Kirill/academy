package by.academy.tasks.OOP.Task6Heritage;

public class Aspirant extends Student {

	private String scientificWork;

	public Aspirant() {
		super();
	}

	public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
		super(firstName, lastName, group, averageMark);
		this.scientificWork = scientificWork;
	}

	public String getScientificWork() {
		return scientificWork;
	}

	public void setScientificWork(String scientificWork) {
		this.scientificWork = scientificWork;
	}

	public double getScholarship() {
		if (averageMark == 5) {
			return 200;
		}
		return 180;
	}

}
