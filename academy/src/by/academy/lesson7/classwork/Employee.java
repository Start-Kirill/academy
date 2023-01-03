package by.academy.lesson7.classwork;

import java.math.BigDecimal;

public class Employee {

	private String fullname;

	private double salary;

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return fullname + " " + salary;
	}

}
