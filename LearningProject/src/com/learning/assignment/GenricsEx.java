package com.learning.assignment;

class GenricTest <T>
{
	T obj;
	public GenricTest(T obj) {
		this.obj=obj;
	}
	public T objFunction()
	{
		return this.obj;
	}
}



public class GenricsEx {

	public static void main(String[] args) {
	GenricTest <Integer> gtest = new GenricTest <Integer> (10);
	System.out.println(gtest.objFunction());
	GenricTest <String> gtest2= new GenricTest<String>("This is a Genric Test");
	System.out.println(gtest2.objFunction());
	
	}

}
