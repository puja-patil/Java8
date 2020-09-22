package com.java8.functionalinterface;

@FunctionalInterface
interface Sayable {

//	single abstract method
	void say(String msg);
}

public class Ex1SingleAbstractMethod implements Sayable {
	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Ex1SingleAbstractMethod e = new Ex1SingleAbstractMethod();
		e.say("Helloo!!");
	}
}
