package com.learning.assignment;

public class FindGreatestNumber {

	public static void main(String[] args) {
		int number1 = 25, number2= 78, number3=87;
		if(number1>number2 && number1>number3 )
		{
			System.out.println(number1+ " is the Greatest number");
		}
		else if(number2>number1 && number2>number3) {
			System.out.println(number2+ " is the Greatest number");
		}
		else 
		{
			System.out.println(number3+ " is the Greatest number");
		}

	}

}
