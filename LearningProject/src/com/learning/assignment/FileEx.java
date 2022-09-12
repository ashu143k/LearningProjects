package com.learning.assignment;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\Users\\ashis\\git\\LearningProject\\LearningProject\\src\\com\\learning\\assignment\\file.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.length());
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		DataOutputStream dos = new DataOutputStream(fos);
		String inputValue = "This is something i m writing in the file";
		byte[] c = inputValue.getBytes();
		fos.write(c);
		fos.close();
		int x = 0;
		while ((x = fis.read()) != -1) {
			System.out.print((char) x);
		}
		fis.close();

	}

}
