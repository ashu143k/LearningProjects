package com.learning.assignment;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.reverse();
		System.out.println(sb2);
		System.out.println(sb1.capacity());
		sb1.append("Hello");
		System.out.println(sb1.capacity());
		sb1.append(" Hello how are you guys I love to do programming");
		System.out.println(sb1.capacity());
		System.out.println(sb1);
	
	}

}
