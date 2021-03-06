package com.jobready.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		Runnable processor1 = new MessageProcessor(3);
		executor.execute(processor1);
		Runnable processor2 = new MessageProcessor(4);
		executor.execute(processor2);
		executor.shutdown();// Rejects any new tasks and Gracefully exits.... or Shuts down the service...
		//executor.shutdownNow();//shuts down immediately...
		/*
		 * while (executor.isTerminated()) {
		 * 
		 * 
		 * }
		 */
		try {
			executor.awaitTermination(2, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Submitted All The Tasks......");

	}
}
