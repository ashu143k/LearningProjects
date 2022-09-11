package com.learning.assignment;

import java.util.Locale;

public class LocaleEx {

	public static void main(String[] args) {
		Locale l1= new Locale("EN","India");
		System.out.println(l1+" Language: "+l1.getDisplayLanguage()+"  Country Name :"+ l1.getCountry()+"hashcode: "+l1.hashCode());
		

	}

}
