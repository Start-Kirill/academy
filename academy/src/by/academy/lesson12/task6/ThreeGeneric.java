package by.academy.lesson12.task6;

import java.io.Serializable;

import by.academy.homework3.deal.Product;

public class ThreeGeneric<T extends Comparable, V extends Product & Serializable, K extends Number> {
	
	private T one;
	private V two;
	private K three;
	
	public ThreeGeneric(T one, V two, K three) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
	}

	public T getOne() {
		return one;
	}

	public V getTwo() {
		return two;
	}

	public K getThree() {
		return three;
	}
	
	public void getNameClass(){
		System.out.println(one.getClass());
		System.out.println(two.getClass());
		System.out.println(three.getClass());
	}
	
	
}
