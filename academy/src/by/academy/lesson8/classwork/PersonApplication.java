package by.academy.lesson8.classwork;

public class PersonApplication {

	public static void main(String[] args) {
		Person Ivan = new Person();
		Person Igor = new Person("Igor Vladimirovich", 56);

		Ivan.move();
		Igor.talk();

	}

}
