package com.jobready.threading;

public class Application2 {

	public static void main(String[] args) {

		System.out.println("Starting Thread1.......");

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				// Thread.currentThread().setName(this.name);
				for (int i = 0; i < 10; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		});

		t1.start();

		System.out.println("Starting Thread2.......");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				// Thread.currentThread().setName(this.name);
				for (int i = 0; i < 10; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		});
		t2.start();

	}

}

class TaskOld implements Runnable {

	String name;

	public TaskOld(String name) {
		super();
		this.name = name;
	}

	public void run() {

		// Thread.currentThread().setName(this.name);
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