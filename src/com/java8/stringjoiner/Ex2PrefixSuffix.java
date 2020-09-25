package com.java8.stringjoiner;

import java.util.StringJoiner;

public class Ex2PrefixSuffix {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[", "]");// passing "," and square brackets as delimiter

		// adding values to string joiner
		joinNames.add("Pooja");
		joinNames.add("Sharmin");
		joinNames.add("Ashutosh");

		System.out.println(joinNames);

	}
}
