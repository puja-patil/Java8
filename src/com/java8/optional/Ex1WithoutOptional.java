package com.java8.optional;


public class Ex1WithoutOptional {
	public static void main(String[] args) {
//		Without using Optional
		String str[] = new String[5];
		String lowerCase = str[3].toLowerCase();
		System.out.println(lowerCase);

	}
}
