package com.java8.defaultmethods;

abstract class AbstractClass {
	public AbstractClass() { // constructor
		System.out.println("You can create constructor in abtract class");
	}

	abstract int add(int a, int b);// abstract method

	int sub(int a, int b) { // non-abstract
		return a - b;
	}

	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

public class Ex3AbstractClass extends AbstractClass {
	@Override
	int add(int a, int b) { // implementing abstract method
		return a + b;
	}

	public static void main(String[] args) {
		Ex3AbstractClass test = new Ex3AbstractClass();
		System.out.println("Addition " + test.add(1, 3));// calling abstract method
		System.out.println("Substraction " + test.sub(3, 2));// calling non-abstract method
		System.out.println("Multiplication " + AbstractClass.multiply(1, 1));// calling static method
	}
}
