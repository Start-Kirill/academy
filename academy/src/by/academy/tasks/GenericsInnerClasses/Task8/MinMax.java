package by.academy.tasks.GenericsInnerClasses.Task8;

import java.util.Arrays;

public class MinMax<T extends Number> {
	private T[] array;

	public MinMax() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MinMax(T[] array) {
		super();
		this.array = array;
	}
	
	public T getMin() {
		Arrays.sort(array);
		return array[0];
	}
	
	public T getMax() {
		Arrays.sort(array);
		return array[array.length - 1];
	}
}
