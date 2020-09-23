package com.java8.base64;

import java.util.Base64;

public class Ex2MIMEEncryption {
	public static void main(String[] args) {
//		Getting MIME Encoder
		Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
		String message = "Hello, \nYou are informed regarding your inconsistency of work";
		String eStr = mimeEncoder.encodeToString(message.getBytes());
		System.out.println("Encoded MIME message: " + eStr);

//		Getting MIME decoder
		Base64.Decoder mimeDecoder = Base64.getMimeDecoder();
		String dStr = new String(mimeDecoder.decode(eStr));
		System.out.println("Decoded message: " + dStr);

	}
}
