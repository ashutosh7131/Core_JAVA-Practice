package com.jobready.threading;

public class Application {

	public static void main(String[] args) {
		System.out.println("Starting Thread1.......");
		Task taskRunner = new Task();
		taskRunner.setName("Thread-A");
		taskRunner.start();

		System.out.println("Starting Thread2.......");
		Task taskRunner2 = new Task();
		taskRunner2.setName("Thread-B");
		taskRunner2.start();

	}

}

class Task extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("number: " + i +" - "+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
