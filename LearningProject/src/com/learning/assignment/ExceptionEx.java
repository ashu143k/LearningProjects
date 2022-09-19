package com.learning.assignment;

public class ExceptionEx {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };// size of array is 5
		try {
			System.out.println(" before Exception");
			System.out.println(a[4]);
			System.out.println("After Exception");
		} catch (Exception e) {
			System.out.println("This is catch of try : " + e);
		} finally {
			System.out.println("This is finally block");
		}
	}

}
