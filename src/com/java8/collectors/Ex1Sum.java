package com.java8.collectors;

import com.java8.streams.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1Sum {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println("Sum of Prices:" + sumPrices);
		Integer sumIds = productsList.stream().collect(Collectors.summingInt(p -> p.id));
		System.out.println("Sum if Ids:" + sumIds);
	}
}
