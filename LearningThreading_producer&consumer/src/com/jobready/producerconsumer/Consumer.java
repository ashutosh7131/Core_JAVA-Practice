package com.jobready.producerconsumer;

import java.util.*;

public class Consumer implements Runnable {

	List<Integer> questionList = null;

	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized (questionList) {
			while (questionList.isEmpty()) {
				System.out.println("No Questions to Answer... Wait for Producer to get Questions");
				questionList.wait();
			}

		}

		synchronized (questionList) {
			Thread.sleep(5000);
			System.out.println("Answered Question: " + questionList.remove(0));
			questionList.notify();
		}

	}

	@Override
	public void run() {

		while (true) {
			try {
				answerQuestion();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}

	}
}