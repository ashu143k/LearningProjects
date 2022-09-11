package com.learning.assignment;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyChange {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double amount=scan.nextDouble();
		scan.close();
		NumberFormat f1= NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat f2= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		NumberFormat f3= NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat f4= NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String us=f1.format(amount);
		String india=f2.format(amount);
		String china=f3.format(amount);
		String france=f4.format(amount);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}

}
