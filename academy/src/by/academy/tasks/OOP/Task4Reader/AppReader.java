package by.academy.tasks.OOP.Task4Reader;

public class AppReader {

	public static void main(String[] args) {
		Book one = new Book("Adventures", "Kirill");
		Book two = new Book("Vocabulary", "Dal");
		Book three = new Book("The Adventures of Tom Sawyer", "Mark Twen");
		
		Reader reader = new Reader("Starovoitov K.A.", 23, "IT", "22-01-1993", "+375447096755");
		
		reader.takeBook(one, two, three);
		reader.takeBook(3);
		reader.takeBook("Adventures", "Vocabulary", "The Adventures of Tom Sawyer");
		
		reader.returnBook(one, two, three);
		reader.returnBook(3);
		reader.returnBook("Adventures", "Vocabulary", "The Adventures of Tom Sawyer");
		
		
	}

}
