package com.java8.methodrefernce;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	public Message(String message) {
		System.out.println(message);
	}
}

public class Ex3RefToConstructorMethod {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}
}
