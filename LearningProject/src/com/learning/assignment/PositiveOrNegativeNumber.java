package com.learning.assignment;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Number to check weather its Postive or Negative Number");
			int number = 0;
			number = scan.nextInt();
			if (number<0) {
				System.out.println(number + " is a Negative Number");
			} else {
				System.out.println(number + " is a Postive Number");
			}
		}

	}

}
