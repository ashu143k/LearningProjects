package com.learning.assignment;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		Calendar calend = Calendar.getInstance();
		System.out.println("Calender : " + calend.getTime());
		calend.add(Calendar.DATE, -10);
		System.out.println("Calender before 10 days : " + calend.getTime());
	}

}
