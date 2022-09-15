package com.cryptography.test;

import java.nio.ByteBuffer;
import java.security.SecureRandom;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;

public class ChaCha20Poly1305Encryption {
	private static final String Encrypt_Alg = "ChaCha20-Poly1305";
	private static final int Nonce_length = 12;

	public byte[] encrypt(byte[] pText, SecretKey key) throws Exception {
		return encrypt(pText, key, getNonce());
	}

	private static byte[] getNonce() {
		byte[] newNonce = new byte[12];
		new SecureRandom().nextBytes(newNonce);
		return newNonce;
	}

	public byte[] encrypt(byte[] pText, SecretKey key, byte[] nonce) throws Exception {
		Cipher c = Cipher.getInstance(Encrypt_Alg);
		IvParameterSpec iv = new IvParameterSpec(nonce);
		c.init(Cipher.ENCRYPT_MODE, key, iv);
		byte[] encryptText = c.doFinal(pText);
		byte[] output = ByteBuffer.allocate(encryptText.length + Nonce_length).put(encryptText).put(nonce).array();
		return output;
	}

	public byte[] decrypt(byte[] cText, SecretKey key) throws Exception {
		ByteBuffer bb = ByteBuffer.wrap(cText);
		byte[] encryptText = new byte[cText.length - Nonce_length];
		byte[] nonce = new byte[Nonce_length];
		bb.get(encryptText);
		bb.get(nonce);
		Cipher c = Cipher.getInstance(Encrypt_Alg);
		IvParameterSpec iv = new IvParameterSpec(nonce);
		c.init(Cipher.DECRYPT_MODE, key, iv);
		byte[] output = c.doFinal(encryptText);
		return output;
	}
}
