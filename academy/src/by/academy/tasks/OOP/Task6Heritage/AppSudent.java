package by.academy.tasks.OOP.Task6Heritage;

public class AppSudent {

	public static void main(String[] args) {
		Student student = new Student("Kirill", "Starovoitov", "TM", 5.0);
		Student aspirant = new Aspirant("Alexand", "Luka", "ZHS", 3.0, "How to make soup");

		Student[] students = { student, aspirant };

		for (Student student2 : students) {
			System.out.println(student2.getScholarship());
		}
	}

}
