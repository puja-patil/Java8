package com.java8.optional;

import java.util.Optional;

public class Ex3OptionalMethods {
	public static void main(String[] args) {
		String str[] = new String[5];
		str[3] = "JAVA OPTIONAL CLASS EXAMPLE";
//		It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println("empty instance " + empty);
//		Return a non-empty Optional
		Optional<String> nonEmpty = Optional.of(str[3]);
		// if the value is present then returns an optional otherwise returns an
		// optional
		System.out.println("Filtered Value: " + nonEmpty.filter(s -> s.equals("Abc")));
		System.out.println("Filtered Value: " + nonEmpty.filter(s -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
//		returns value of an Optional. If value is not present, throws NosuchElementException
		System.out.println("Getting value: " + nonEmpty.get());
//		returns hashcode of the value
		System.out.println("hashcode: " + nonEmpty.hashCode());
//		It returns true if value is present else fals3e
		System.out.println("Is value present: " + nonEmpty.isPresent());
//		It returns a non empty Optional if value is present else empty optional
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[3]));
//		It returns value if available, otherwise returns specified value,
		System.out.println("OrElse: " + nonEmpty.orElse("Value is not present"));
		System.out.println("OrElse: " + empty.orElse("Value is not presest"));
		nonEmpty.ifPresent(System.out::println); //printing c=value using reference method
	}
}
