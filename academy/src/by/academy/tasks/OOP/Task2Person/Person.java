package by.academy.tasks.OOP.Task2Person;

public class Person {

	protected String fullName;
	protected int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void move() {
		System.out.println(fullName + " is moving");
	}
	
	public void talk() {
		System.out.println(fullName + " is saying");
	}

}
