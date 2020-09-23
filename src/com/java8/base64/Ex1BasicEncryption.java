package com.java8.base64;

import java.util.Base64;

public class Ex1BasicEncryption {
	public static void main(String[] args) {
//		getting encoder
		Base64.Encoder encoder = Base64.getEncoder();
//		Creating byte array
		byte byteArr[] = { 1, 2 };
//		encoding byte array
		byte byteArr2[] = encoder.encode(byteArr);
		System.out.println("Encoded byte array " + byteArr2);
		byte byteArr3[] = new byte[5];// Mke sure it has enough size to store copied bytes
		int x = encoder.encode(byteArr, byteArr3);
		System.out.println("Encoded byte array written to another array " + byteArr3);
		System.out.println("Number of bytes written " + x);

//		Encoding string
		String str = encoder.encodeToString("Pooja".getBytes());
		System.out.println("Encoded String " + str);
//		Getting decoder
		Base64.Decoder decoder = Base64.getDecoder();
//		Decoding String
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded String " + dStr);

		Base64.Encoder urlEncoder = Base64.getUrlEncoder();
		String eStr = urlEncoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
		System.out.println("Encoded URL " + eStr);
		Base64.Decoder urlDecoder = Base64.getUrlDecoder();
		String dUrlStr = new String(urlDecoder.decode(eStr));
		System.out.println("decoded URL " + dUrlStr);
	}
}
