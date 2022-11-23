package by.academy.lesson2.classwork;

public class Cat {
	int age;
	String nickname;
	double money;
	boolean isHomeAnimal;
	char initials;

	public Cat() {
		super();
	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setInitials() {
		initials = nickname.charAt(0);
	}

	public char getInitials() {
		return initials;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	public void grow() {
		age++;
	}

	public void eat() {
		System.out.println("A cat is eating");
	}

	public void sleep() {
		System.out.println("A cat is sleeping");
	}

	public void walk() {
		System.out.println("A cat is walking");
	}

	public void buyMeal(double price) {
		money -= price;
	}

}
