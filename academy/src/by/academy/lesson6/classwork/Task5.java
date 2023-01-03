package by.academy.lesson6.classwork;

public class Task5 {

	public static void main(String[] args) {
		getString("Starovoitovichenskiy", "9", "math");
	}

	static void getString(String name, String m, String s) {
//		StringBuilder secondName = new StringBuilder(15);
//		StringBuilder mark = new StringBuilder(3);
//		StringBuilder subject = new StringBuilder(10);
//
//		secondName.setLength(15);
//		secondName.append(name);
//		mark.append(m);
//		subject.append(s);
//
//		StringBuilder string = new StringBuilder("Student " + secondName + " get " + mark + " on " + subject);
//		System.out.println(string);
		
		System.out.printf("Studen %s get %s on %s \n", name, m, s);
	}

}
