package com.java8.lambdaexp;

import java.util.ArrayList;
import java.util.List;

public class Example4ForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}
}
