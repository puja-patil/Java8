package com.java8.functionalinterface;

interface Sayable3 {
	void say(String msg); // abstract method
}

//@FunctionalInterface // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
//interface Doable extends Sayable3{
//	void doIt();
//}

interface nonFunctional {
	default void say(String msg) {
		System.out.println("Non functional interface " + msg);
	}
}

@FunctionalInterface
interface functional extends nonFunctional {
	void doIt();
}

public class Ex3InheritInterface implements functional {
	@Override
	public void doIt() {
		System.out.println("do It");

	}

	public static void main(String[] args) {
		Ex3InheritInterface e = new Ex3InheritInterface();
		e.doIt();
		e.say("Hello");
	}
}
