package com.java8.stringjoiner;

import java.util.StringJoiner;

public class Ex4StringJoinerMethods {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[", "]");// passing "," and square brackets as delimiter

//		Prints nothing coz its empty
		System.out.println(joinNames);
//		We can set empty default values
		joinNames.setEmptyValue("It is empty");
		System.out.println(joinNames);

//		Adding values to string joiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		System.out.println(joinNames);

//		Return length of string joiner
		int length = joinNames.length();
		System.out.println("Length:" + length);

//		Returns StringJoiner as String type
		String str = joinNames.toString();
		System.out.println("String:" + str);

//		Now, we can apply String methods on it
		char ch = str.charAt(3);
		System.out.println("Char at 3:" + ch);

//		Adding one more element
		joinNames.add("Sorabh");
		System.out.println(joinNames);

//     	Returns new length
		int newLength = joinNames.length();
		System.out.println("New Length: " + newLength);
	}
}
