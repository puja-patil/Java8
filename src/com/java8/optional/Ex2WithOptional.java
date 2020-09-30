package com.java8.optional;

import java.util.Optional;

public class Ex2WithOptional {
	public static void main(String[] args) {
//	    Using Optional when value is not present
		String str[] = new String[5];
		Optional<String> checkNull = Optional.ofNullable(str[3]);
		if (checkNull.isPresent()) {
			String lower = str[3].toLowerCase();
			System.out.println(lower);
		} else {
			System.out.println("String value is not present.");
		}

//		Using optional when value is present
		String str2[] = new String[5];
		str2[3] = "JAVA OPTIONAL CLASS EXAMPLE";
		Optional<String> checkIfPresent = Optional.ofNullable(str2[3]);
		if (checkIfPresent.isPresent()) {
			String lowerCase = str2[3].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("String value is not present.");
		}

		checkIfPresent.ifPresent(System.out::println);
		System.out.println(checkIfPresent.get());
		System.out.println(str2[3].toLowerCase());

	}
}
