package com.java8.defaultmethods;

interface Sayable {
//	Default method
	default void say() {
		System.out.println("Hello! This is a default method.");
	}

//	Abstract Method
	void sayMore(String msg);
}

public class Ex1DefaultMethod implements Sayable {
	@Override // implement abstract method
	public void sayMore(String msg) {
		System.out.println("Abstract method " + msg);
	}

	public static void main(String[] args) {
		Ex1DefaultMethod e = new Ex1DefaultMethod();
		e.say();
		e.sayMore("hello");
	}
}
