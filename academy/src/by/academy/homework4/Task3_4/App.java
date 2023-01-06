/*
 * Homework #4. Task #3-4
 * 
 * Kirill Starovoitov
 */
package by.academy.homework4.Task3_4;

import java.util.Iterator;

/**
 * Testing class for task #3-4 Homework # 4
 * 
 */
public class App {

	public static void main(String[] args) {

		CustomArrayList<String> list = new CustomArrayList<String>();

		String one = "one";
		String two = "two";
		String three = "three";
		String four = "four";
		String five = "five";
		String six = "six";

		list.add(one);
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		list.add(six);

		list.remove(2);
		System.out.println(list.getCapacity());
		System.out.println(list.getSize());
		System.out.println(list.get(2));
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		System.out.println(list.getLastIndex());
		System.out.println(list.remove(one));
		list.remove(one);

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
