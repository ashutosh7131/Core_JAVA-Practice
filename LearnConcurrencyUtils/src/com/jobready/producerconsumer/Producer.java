package com.jobready.producerconsumer;

import java.util.*;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	int questionNo;
	BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (true) {
			// questionNo++;
			try {
				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("We got our next uestion: " + nextQuestion);
					questionQueue.put(nextQuestion);
					// questionQueue.put(questionNo++);
					// questionQueue.put(getNextQuestion());
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		/*
		 * private synchronized int getNextQuestion() {
		 * 
		 * int nextQuestion = questionNo++;
		 * System.out.println("We got our next uestion: " + nextQuestion); return
		 * nextQuestion;
		 * 
		 * }
		 */

	}
}
