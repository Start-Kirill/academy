/*
 * Homework #4. Task #4
 * 
 * Kirill Starovoitov
 */
package by.academy.homework4.Task4;

import java.util.Iterator;

/**
 * Implementation of task#4 of Homework #4
 * 
 * Making customized Iterator
 * 
 * @version 1.0 06 Jan 2023
 * @author Kirill Starovoitov
 *
 * @param <T> type of objects to be iterating
 */
public class CustomIterator<T> implements Iterator<T> {

	private T[] array;
	private int index;
	private int size;

	public CustomIterator() {
		super();
	}

	public CustomIterator(T[] array, int size) {
		this.array = array;
		this.size = size;
	}

	@Override
	public boolean hasNext() {
		if (array == null || size <= index) {
			return false;
		}
		return true;
	}

	@Override
	public T next() {
		return array[index++];
	}
}
