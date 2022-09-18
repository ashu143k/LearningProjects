package com.factory.pattern;

import java.util.Scanner;

public class FactoryPatternProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NetflixPlanFactory n1 = new NetflixPlanFactory();
		System.out.println("Enter the Subcription plan");
		String userChoice = scan.next();
		System.out.println("Enter for number of months");
		int months = scan.nextInt();
		NetflixPlan plan = n1.getNetflixPlan(userChoice);
		System.out.println("Monthly bill Amount is : " + plan.getPrice());
		System.out.println("Overall bill Amount is : " + plan.getFinalAmount(months));
		scan.close();
	}
}
