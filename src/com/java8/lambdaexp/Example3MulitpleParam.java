package com.java8.lambdaexp;

interface Addable {
	int add(int a, int b);
}

public class Example3MulitpleParam {
	public static void main(String[] args) {

//		with return keyword	with data types		
		Addable add = (int a, int b) -> {
			return a + b;
		};

		System.out.println(add.add(1, 1));

//		without return keyword without data types
		Addable add2 = (a, b) -> (a + b);
		System.out.println(add2.add(3, 5));
	}
}
