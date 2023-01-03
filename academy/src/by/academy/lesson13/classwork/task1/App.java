package by.academy.lesson13.classwork.task1;

public class App {

	public static void main(String[] args) {
		User user = new User("Kirill", "12345678");
		
		user.createQuery();
		
		User.Query query = user.new Query();
		query.printToLog();
		
		User.Query query1 = new User("Anton", "987654321").new Query();
		query1.printToLog();
	}

}
