package com.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class Ex1ForEach {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression--------------");
		gamesList.forEach(game -> System.out.println(game));
		System.out.println("------------Iterating by passing method reference--------------");
		gamesList.forEach(System.out::println);
	}
}
