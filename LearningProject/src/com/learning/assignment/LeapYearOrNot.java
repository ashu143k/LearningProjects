package com.learning.assignment;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the year to check its Leap year or not");
			int year = 0;
			year = scan.nextInt();
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println(year + " is a Leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		}
	}
}