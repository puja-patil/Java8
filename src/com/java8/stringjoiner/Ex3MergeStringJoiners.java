package com.java8.stringjoiner;

import java.util.StringJoiner;

public class Ex3MergeStringJoiners {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[", "]");// passing "," and square brackets as delimiter

		// adding values to string joiner
		joinNames.add("Pooja");
		joinNames.add("Sharmin");
		joinNames.add("Ashutosh");

		StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
		joinNames2.add("Patil");
		joinNames2.add("Shaikh");
		joinNames2.add("Patil");

		System.out.println(joinNames.merge(joinNames2));

	}
}
