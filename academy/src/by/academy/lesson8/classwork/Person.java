package by.academy.lesson8.classwork;

public class Person {
	private String fullName;
	private int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public void move() {
		System.out.println(fullName + " is moving");
	}

	public void talk() {
		System.out.println(fullName + " is saying");
	}
}
