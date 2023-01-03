package by.academy.lesson9.classwork;

public class TestProductApplication {

	public static void main(String[] args) {
		Beer neIpa = new Beer("NeIPA", 2.89, 4, 0.5);
		Prawns vanameyPrawns = new Prawns("Vanamey", 24.99, 0.5, 'S');

		System.out.println(neIpa.calcPrice());
		System.out.println(vanameyPrawns.calcPrice());
		System.out.println(neIpa);
		System.out.println(vanameyPrawns);

	}

}
