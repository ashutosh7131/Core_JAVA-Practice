package com.jobready.producerconsumer;

import java.util.*;

public class Producer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;

	public Producer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}

	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized (questionList) {
			while (questionNo == LIMIT) {
				System.out.println("Questions have piled up... Wait for Answers");
				questionList.wait();
			}

		}

		synchronized (questionList) {
			System.out.println("New Question: " + questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
		}

	}

	@Override
	public void run() {
		
		while(true) {
			try {
				readQuestion(questionNo++);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}

	}

}
}
