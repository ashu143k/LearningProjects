package com.thread.concurrency;

import java.util.LinkedList;

class Consumer implements Runnable {
	// buffer to consume items from
	private final LinkedList<Integer> buffer;

	Consumer(LinkedList<Integer> buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 5) {
			try {
				this.consume();
				i++;
			} catch (Exception e) {
				System.out.print(e);
			}
		}
	}

	public void consume() throws InterruptedException {
		synchronized (buffer) {
			// Wait if the buffer is empty
			while (buffer.size() == 0) {
				System.out.println("Consumer is waiting");
				buffer.wait();
			}
			// Consume the first item from the buffer
			int num = buffer.remove(0);
			System.out.println("Consumer consumed: " + num);
			buffer.notifyAll();
			Thread.sleep(5);
		}
	}
}
