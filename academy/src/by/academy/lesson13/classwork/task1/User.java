package by.academy.lesson13.classwork.task1;

public class User {
	private String login;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public class Query {
		public void printToLog() {
			System.out.println("User with login " + login + " and with password " + password + " sent query");
		}
	}

}
