package com.learning.assignment;

class ThreadClass extends Thread{
	public void run()
	{
		System.out.println("Thread Class running");
	}
}

public class ThreadConcept {

	public static void main(String[] args) {
		ThreadClass t1=new ThreadClass();
		t1.run();

	}

}
