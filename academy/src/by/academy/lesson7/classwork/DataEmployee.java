package by.academy.lesson7.classwork;

import java.util.Random;

public class DataEmployee {

	private static final Random rand = new Random();

	public static void main(String[] args) {
		String[] names = {"Amelia", "Margaret",	"Emma", "Mary", "Williams",	"O'Sullivan"};
		Employee[] empl = new Employee[3];

		empl[0] = new Employee();
		empl[1] = new Employee();
		empl[2] = new Employee();

		for (int i = 0; i < 3; i++) {
			empl[i].setSalary(rand.nextDouble(100, 10000000));
			empl[i].setFullname(names[rand.nextInt(names.length)]);
		}
		
		Report.generateReport(empl);
//		System.out.printf("Salary %.2f \n", one.getSalary());

	}

}
