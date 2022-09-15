package com.cryptography.test;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Chacha20Poly1305 {
	private static final int Nonce_length = 12;
	private static final int MAC_length = 16;

	public static void main(String args[]) throws Exception {
		String input = "This is a Chacha20Poly1305";
		ChaCha20Poly1305Encryption cipher = new ChaCha20Poly1305Encryption();
		SecretKey key = getKey();
		System.out.println("Input : " + input);
		System.out.println("Input to hex : " + convertBytesToHex(input.getBytes()));
		System.out.println("Encrption");
		byte[] cText = cipher.encrypt(input.getBytes(), key);
		System.out.println("Key Hex : " + convertBytesToHex(key.getEncoded()));
		System.out.println("Encrpted Hex : " + convertBytesToHex(cText));
		System.out.println("Mac and Nonce");
		ByteBuffer bb = ByteBuffer.wrap(cText);
		byte[] orignalCText = new byte[input.getBytes().length];
		byte[] nonce = new byte[Nonce_length];
		byte[] mac = new byte[MAC_length];
		bb.get(orignalCText);
		bb.get(nonce);
		bb.get(mac);
		System.out.println("Cipher Orignal Hex : " + convertBytesToHex(orignalCText));
		System.out.println("Mac hex : " + convertBytesToHex(mac));
		System.out.println("Nonce Hex : " + convertBytesToHex(nonce));
		System.out.println("Decryption");
		System.out.println("Input Hex : " + convertBytesToHex(cText));
		byte[] dText = cipher.decrypt(cText, key);
		System.out.println("Key Hex : " + convertBytesToHex(key.getEncoded()));
		System.out.println("Decrypted Hex : " + convertBytesToHex(dText));
		System.out.println("Decrypted : " + new String(dText));
	}

	private static SecretKey getKey() throws NoSuchAlgorithmException {
		KeyGenerator keygGen = KeyGenerator.getInstance("ChaCha20");
		keygGen.init(256, SecureRandom.getInstanceStrong());
		return keygGen.generateKey();
	}

	private static String convertBytesToHex(byte[] bytes) {
		StringBuilder result = new StringBuilder();
		for (byte t : bytes) {
			result.append(String.format("%02x", t));
		}
		return result.toString();
	}
}
