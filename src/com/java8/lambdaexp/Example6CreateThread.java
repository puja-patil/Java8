package com.java8.lambdaexp;

public class Example6CreateThread {
	public static void main(String[] args) {

//		thread example wothout lambda
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 is running...");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

//		Thread example with lambda
		Runnable r2 = () -> {
			System.out.println("Thread 2 is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();

	}
}
