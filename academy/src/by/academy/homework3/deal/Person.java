package by.academy.homework3.deal;

import java.time.LocalDate;

public class Person {

	private String name;
	private double money;
	private LocalDate dateOfBirth;
	private String phone;
	private String email;

	public Person() {
		super();
	}

	public Person(String name, double money, LocalDate dateOfBirth) {
		this.name = name;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
	}

	public Person(String name, double money, LocalDate dateOfBirth, String phone, String email) {
		this(name, money, dateOfBirth);
		this.phone = phone;
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public double getMoney() {
		return money;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", money=" + money + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
