package com.thread.concurrency;

import java.util.LinkedList;

public class ConcurrencyMain {

	public static void main(String[] args) {
		LinkedList<Integer> buffer = new LinkedList<>();
		Producer producer = new Producer(buffer);// creation of Object for Producer with passing buffer as a empty List
		Consumer consumer = new Consumer(buffer);// Creation of Object for Consumer with passing buffer as a empty List
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();	

	}

}
