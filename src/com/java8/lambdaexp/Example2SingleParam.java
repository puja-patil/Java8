package com.java8.lambdaexp;

interface Sayable {
	public String say(String name);
}

public class Example2SingleParam {
	public static void main(String[] args) {
		Sayable s1 = (name1) -> {
			return "Hello " + name1;
		};
		System.out.println(s1.say("Pooja"));
	}
}
