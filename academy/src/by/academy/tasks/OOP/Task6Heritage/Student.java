package by.academy.tasks.OOP.Task6Heritage;

public class Student {

	protected String firstName;
	protected String lastName;
	protected String group;
	protected double averageMark;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String group, double averageMark) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.averageMark = averageMark;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	public double getScholarship() {
		if (averageMark == 5) {
			return 100;
		}
		return 80;
	}

}
