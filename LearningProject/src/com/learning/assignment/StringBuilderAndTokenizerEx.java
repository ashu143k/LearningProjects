package com.learning.assignment;

import java.util.StringTokenizer;

public class StringBuilderAndTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer str= new StringTokenizer("Hi how are you guys why this kolavari"," ");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}

	}

}
