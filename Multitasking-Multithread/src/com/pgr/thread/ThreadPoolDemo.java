package com.pgr.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadA_Pool implements Runnable {

	String message;

	public ThreadA_Pool(String message) {
		this.message = message;
	}

	@Override
	public void run() {

		System.out.println("Started");
		System.out.println(Thread.currentThread().getName() + "-Task " + message);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended");
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		ThreadA_Pool threadA_Pool1 = new ThreadA_Pool("Hi");
		service.execute(threadA_Pool1);
		ThreadA_Pool threadA_Pool2 = new ThreadA_Pool("Hello");
		service.execute(threadA_Pool2);

		ThreadA_Pool threadA_Pool3 = new ThreadA_Pool("Wellcome");
		service.execute(threadA_Pool3);

		ThreadA_Pool threadA_Pool4 = new ThreadA_Pool("JJJ");
		service.execute(threadA_Pool4);

		service.shutdown();

		if (service.isTerminated()) {
			System.out.println("Threads execution is completed");
		}

	}
}
