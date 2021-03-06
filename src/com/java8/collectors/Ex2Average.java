package com.java8.collectors;

import com.java8.streams.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2Average {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		Double average = productsList.stream().collect(Collectors.averagingDouble(p -> p.price));
		System.out.println("Price average : " + average);
	}
}
