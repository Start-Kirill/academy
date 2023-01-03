package by.academy.tasks.OOP.Task7.professions;

import by.academy.tasks.OOP.Task2Person.Person;

public class Driver extends Person{
	private String initials;
	private int experience;

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(String fullName, int age, String initials, int experience) {
		super(fullName, age);
		this.initials = initials;
		this.experience = experience;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Driver [initials=" + initials + ", experience=" + experience + ", fullName=" + fullName + ", age=" + age
				+ "]";
	}

}
