package com.java8.defaultmethods;

interface Sayable2 {
//	default method
	default void say() {
		System.out.println("Default method");
	}

//	abstract method
	void sayMore(String msg);

//	static method
	static void sayLouder(String msg) {
		System.out.println("in static method " + msg);
	}
}

public class Ex2Static implements Sayable2 {
	@Override
	public void sayMore(String msg) {
		System.out.println("abtract method");
	}

	public static void main(String[] args) {
		Ex2Static e = new Ex2Static();
		e.say();
		e.sayMore("hello");
		Sayable2.sayLouder("Hello");
	}
}
