package by.academy.tasks.OOP.Task2Person;

public class PersonApp {

	public static void main(String[] args) {
		Person vasiliy = new Person();
		Person evgeniy = new Person("Evgeniy", 27);
		
		vasiliy.move();
		vasiliy.talk();
		evgeniy.move();
		evgeniy.talk();

	}

}
