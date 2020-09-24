package com.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class Ex2ForEachOrdered {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression---------------");
		gamesList.stream().forEachOrdered(game -> System.out.println(game));
		System.out.println("------------Iterating by passing method reference---------------");
		gamesList.stream().forEachOrdered(System.out::println);
	}
}
