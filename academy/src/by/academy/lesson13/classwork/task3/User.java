package by.academy.lesson13.classwork.task3;

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

	static public class Query {
		private User user;

		Query(User user) {
			this.user = user;
		}

		void printToLog() {
			System.out.println("User with login " + user.login + " and with password " + user.password + " sent query");
		}
	}

}
