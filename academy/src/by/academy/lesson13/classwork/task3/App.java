package by.academy.lesson13.classwork.task3;

public class App {

	public static void main(String[] args) {
		User.Query query = new User.Query(new User("Kirill", "12444345"));
		query.printToLog();
	}
}
