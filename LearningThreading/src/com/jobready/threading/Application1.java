package com.jobready.threading;

public class Application1 {

	public static void main(String[] args) {

		System.out.println("Starting Thread1.......");
		//TaskNew taskRunner = new TaskNew("Thread-A");
		Thread t1 = new Thread(new TaskNew("Thread-A"));
		//taskRunner.run();
		t1.start();

		System.out.println("Starting Thread2.......");
		//TaskNew taskRunner2 = new TaskNew("Thread-B");
		//taskRunner2.run();
		Thread t2 = new Thread(new TaskNew("Thread-B"));
		t2.start();

	}

}

class TaskNew implements Runnable {

	String name;

	public TaskNew(String name) {
		super();
		this.name = name;
	}

	public void run() {
		
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 10; i++) {
			System.out.println("number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
