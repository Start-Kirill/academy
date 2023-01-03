package by.academy.tasks.GenericsInnerClasses.Task6;

import java.io.Serializable;

import by.academy.tasks.OOP.Task8.Animals.Animal;

public class Gener<T extends Comparable, V extends Animal & Serializable, K extends Number> {
	private T t;
	private V v;
	private K k;

	public Gener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gener(T t, V v, K k) {
		super();
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public void printNames() {
		System.out.println(t.getClass());
		System.out.println(v.getClass());
		System.out.println(k.getClass());
	}
}
