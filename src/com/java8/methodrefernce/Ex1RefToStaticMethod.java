package com.java8.methodrefernce;

import java.util.function.BiFunction;

interface Sayable {
	void say();
}

//for using bifunction interface
class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class Ex1RefToStaticMethod {
	static void saySomething() {
		System.out.println("In static method");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running..");
	}

	public static void main(String[] args) {
//		Referring static method example 1
		Sayable sayable = Ex1RefToStaticMethod::saySomething;
		sayable.say();

//		example 2 for predefined functional interface
		Thread t2 = new Thread(Ex1RefToStaticMethod::ThreadStatus);
		t2.start();

//		using bifunction interface
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println("result "+result);

//		override static methods using method reference
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 2.0f);

		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
	}

}
