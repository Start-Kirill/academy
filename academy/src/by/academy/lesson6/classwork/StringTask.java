/*
 * 
 */
package by.academy.lesson6.classwork;

public class StringTask {

	public static void main(String[] args) {
		String temp = "Для работы со строками в языке Java используются классы String,"
				+ " StringBuilder, StringBuffer";

		int i = -1;
		while (i < temp.lastIndexOf('S')) {
			System.out.println("indexOf(S): " + (i = temp.indexOf('S', i + 1)));
		}

	}

}
