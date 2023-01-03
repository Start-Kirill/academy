package by.academy.lesson6.classwork;

public class StringsClasswork {

	public static void main(String[] args) {
//		setString("I like Java!!!");
//		Task2();
//		Task3();
		Task4();
	}

	static void setString(String a) {
		System.out.println(a.charAt(a.length() - 1));
		if (a.endsWith("!!!")) {
			System.out.println("The string ends with !!!");
		} else {
			System.out.println("The string doesn't end with !!!");
		}

		if (a.startsWith("I like")) {
			System.out.println("The string starts with 'I like'");
		} else {
			System.out.println("The string doesn't starts with 'I like'");
		}

		if (a.contains("Java")) {
			System.out.println("The string contains 'Java'");
		}

		System.out.println(a.indexOf("Java"));
		System.out.println(a);

		int i = -1;
		char[] array = new char[a.length()];
		array = a.toCharArray();
//		System.out.println(array[0]);

		do {
			array[i = a.indexOf('a', i + 1)] = 'o';
		} while (a.indexOf('a', i + 1) > 0);

		String a2 = a.replace('a', 'o');

		String b = new String(array);

		System.out.println(b);
		System.out.println(a2);

		String c = new String(a.toUpperCase());

		System.out.println(c);

		String d = new String(a.toLowerCase());

		System.out.println(d);

		String f = new String(a.substring(a.indexOf("Java"), a.indexOf("Java") + 4));

		System.out.println(f);
	}

	static void Task2() {
		String three = "3";
		String fiftySix = "56";

		StringBuilder stringOne = new StringBuilder();
		StringBuilder stringTwo = new StringBuilder();
		StringBuilder stringThree = new StringBuilder();
		stringOne.append(three + " + " + fiftySix + " = " + (Integer.parseInt(three) + Integer.parseInt(fiftySix)));
		stringTwo.append(three + " - " + fiftySix + " = " + (Integer.parseInt(three) - Integer.parseInt(fiftySix)));
		stringThree.append(three + " * " + fiftySix + " = " + (Integer.parseInt(three) * Integer.parseInt(fiftySix)));

		System.out.println(stringOne);
		System.out.println(stringTwo);
		System.out.println(stringThree);

//		stringOne.toString().

	}

	static void Task3() {

		String string = "Object-oriented programming blablalallll Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming";
		StringBuilder tempString = new StringBuilder(string);
		StringBuilder tempStringAdd = new StringBuilder(string.toLowerCase());
		String substring = "Object-oriented programming".toLowerCase();

		int i = string.length();
		int counter = 0;
		int counter2 = 0;
		int j = 0;
		do {
			j = tempStringAdd.indexOf(substring, j + 1);
			counter++;
		} while (j >= 0);

		System.out.println(counter);

		do {
			i = tempStringAdd.lastIndexOf(substring, i - 1);
			counter2++;
			if (counter % 2 == 0 && counter2 % 2 != 0) {
				if (i >= 0) {
					tempString.replace(i, i + substring.length(), "OOP");
				}
			} else if (counter % 2 != 0 && counter2 % 2 == 0) {
				if (i >= 0) {
					tempString.replace(i, i + substring.length(), "OOP");
				}
			}

		} while (i >= 0);

		System.out.println(tempString);

	}
	
	static void Task4() {
		String word = "Kirilliuss";
		
		String newWord = new String(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
		
		System.out.println(newWord);
		
	}
	
	static void Task5() {
		
	}
	
	

}
