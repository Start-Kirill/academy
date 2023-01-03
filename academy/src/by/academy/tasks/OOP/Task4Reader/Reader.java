package by.academy.tasks.OOP.Task4Reader;

public class Reader {
	private String initials;
	private int libraryCard;
	private String faculty;
	private String dateOfBirth;
	private String phone;

	public Reader() {
		super();
	}

	public Reader(String initials, int libraryCard, String faculty, String dateOfBirth, String phone) {
		super();
		this.initials = initials;
		this.libraryCard = libraryCard;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getLibraryCard() {
		return libraryCard;
	}

	public void setLibraryCard(int libraryCard) {
		this.libraryCard = libraryCard;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void takeBook(int n) {
		System.out.println(initials + " took " + n + " books");
	}

	public void takeBook(String... name) {
		System.out.println(initials + " took following books:");
		for (String string : name) {
			System.out.print(string + ", ");
		}
		System.out.print(".");
	}

	public void takeBook(Book... books) {
		System.out.println(initials + " took following books:");
		for (Book book : books) {
			System.out.print(book.getName() + ", ");
		}
		System.out.print(".");
	}

	public void returnBook(int n) {
		System.out.println(initials + " returned " + n + " books");
	}

	public void returnBook(String... name) {
		System.out.println(initials + " returned following books:");
		for (String string : name) {
			System.out.print(string + ", ");
		}
		System.out.print(".");
	}

	public void returnBook(Book... books) {
		System.out.println(initials + " returned following books:");
		for (Book book : books) {
			System.out.print(book.getName() + ", ");
		}
		System.out.print(".");
	}

}
