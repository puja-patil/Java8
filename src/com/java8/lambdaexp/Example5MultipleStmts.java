package com.java8.lambdaexp;

@FunctionalInterface
interface Sayable2 {
	String say(String message);
}

public class Example5MultipleStmts {
	public static void main(String[] args) {
		Sayable2 s = (message) -> {
			String s1 = "I would like to say, ";
			String s2 = s1 + message;
			return s2;
		};
		System.out.println(s.say("Time is indeed precious"));
	}
}
