package com.pgr.thread;

class Thread_B extends Thread {

	@Override
	public void run() {// runnable state
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Thread_B a1 = new Thread_B();// new state
		a1.setName("Dhatrika");
		System.out.println(a1.getName());
		a1.start();// about to start run execution
		a1.setPriority(Thread.NORM_PRIORITY);
		Thread_B a2 = new Thread_B();// new state
		a2.setName("Dhruvika");
		a1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(a2.getName());
		a2.start();// about to start run execution
	}
}
