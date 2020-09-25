package com.java8.stringjoiner;

import java.util.StringJoiner;

public class Ex1StringJoiner {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",");// passing "," as delimiter

		// adding values to string joiner
		joinNames.add("Pooja");
		joinNames.add("Sharmin");
		joinNames.add("Ashutosh");
		
		System.out.println(joinNames);

	}
}
