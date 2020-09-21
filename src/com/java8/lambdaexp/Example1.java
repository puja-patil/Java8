package com.java8.lambdaexp;

public class Example1 {
	public static void main(String[] args) {
		int width = 10;

//		 without using lambda expressions
		Drawable draw = new Drawable() {

			@Override
			public void draw() {
				System.out.println("without using lambda expressions " + width);

			}
		};

		draw.draw();

		// using Lambda expressions
		Drawable draw2 = () -> {
			System.out.println("using lambda expressions " + width);
		};
		draw2.draw();
	}
}

interface Drawable {
	public void draw();
}