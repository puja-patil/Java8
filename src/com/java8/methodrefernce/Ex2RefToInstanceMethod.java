package com.java8.methodrefernce;

import java.util.function.BiFunction;

interface Sayable2 {
	void say();
}

class Arithmetic2 {
	public int add(int a, int b) {
		return a + b;
	}
}

public class Ex2RefToInstanceMethod {
	public void saySomething() {
		System.out.println("In non-static method");
	}

	public static void main(String[] args) {
		Ex2RefToInstanceMethod ref = new Ex2RefToInstanceMethod();
//		Referring non-static method using reference
		Sayable2 sayable = ref::saySomething;
		sayable.say();
//		Referring non-static method using anonymous object
		Sayable2 sayable2 = new Ex2RefToInstanceMethod()::saySomething;
		sayable2.say();

		Thread t1 = new Thread(new Ex2RefToInstanceMethod()::saySomething);
		t1.start();

		BiFunction<Integer, Integer, Integer> adder = new Arithmetic2()::add;
		int result = adder.apply(3, 9);
		System.out.println(result);
	}
}
