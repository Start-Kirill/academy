package by.academy.lesson12;

import java.util.Arrays;

import by.academy.lesson2.classwork.Cat;

public class Box<T> {
	
	private T[] items;

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}
	
	public void addItem() {
		
	}
	
	public T getItem(int i) {
		return null;
	}

	@Override
	public String toString() {
		return "CatBox [cats=" + Arrays.toString(items) + "]";
	}

}
