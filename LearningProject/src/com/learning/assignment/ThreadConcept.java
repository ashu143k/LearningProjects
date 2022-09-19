package com.learning.assignment;


class threadClass1 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread Class running interface");
	}
	//interface 
}
class ThreadClass extends Thread {
	//class
	public void run() {
		int i = 10;
		int j = 10;
		System.out.println(i + j);
		System.out.println("Thread Class running");
	}
}

public class ThreadConcept {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		t1.start();
		
		
		
		threadClass1 t2= new threadClass1();
		Thread threadobj= new Thread(t2);
		threadobj.start();
		
	}

}
