package com.learning.assignment;

public class InnerEx {
	private String msg = "Hello";
	class Inner
	{
		InnerEx obj1= new InnerEx();
		public void display()
		{
			System.out.println(obj1.msg+", How are you");
		}
	}

	public static void main(String[] args) {
		InnerEx obj = new InnerEx();
		InnerEx.Inner innerObj= obj.new Inner();
		String s = obj.msg;
		System.out.println(s);
		innerObj.display();
		
	}
}
