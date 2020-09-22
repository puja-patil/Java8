package com.java8.functionalinterface;

@FunctionalInterface
interface Sayable2 {
	void say(String msg);// abstract method

//	 It can contain any number of Object class methods.
	int hashCode();

	String toString();

	boolean equals(Object obj);

}

public class Ex2ObjectClassMethods implements Sayable2 {
	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Ex2ObjectClassMethods e = new Ex2ObjectClassMethods();
		e.say("Hello");
	}
}
