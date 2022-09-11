package com.learning.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat stf=new SimpleDateFormat("E dd/MM/yyyy/DD 'at' hh:mm:ss a zzz"); // dd= date, MM= month , yyyy = year, DD = Number of day
		System.out.println(stf.format(date));
		

	}

}
