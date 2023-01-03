package by.academy.lesson7.classwork;

public class Report {
	static void generateReport(Employee[] empl) {
		for(Employee one: empl) {
			System.out.printf("%s	%.2f\n",one.getFullname(), one.getSalary());
		}
	}
}
