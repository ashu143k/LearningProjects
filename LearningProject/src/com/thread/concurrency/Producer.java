package com.thread.concurrency;

import java.util.LinkedList;
import java.util.Random;

class Producer implements Runnable
{
	//buffer to store the produced items
	private final LinkedList<Integer> buffer;	
	Producer(LinkedList<Integer> buffer)
	{
		this.buffer = buffer;
	}
	@Override
	public void run()
	{		int i = 0;
		
		while(i<5)//which itrate for 5 times
		{
			try {
			this.produce();
			i++;
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}
	}	
	public void produce() throws InterruptedException
	{
		synchronized(buffer)
		{
			//If the buffer is full then wait
			while(buffer.size() == 5)
			{
				System.out.println("Producer is waiting");
				buffer.wait();
			}			
			//Produce a new random number
			Random r = new Random();
			int num = r.nextInt(100);
			System.out.println("Producer produced: " + num);
			buffer.add(num);
			buffer.notifyAll();
			Thread.sleep(10);
		}
	}
}
