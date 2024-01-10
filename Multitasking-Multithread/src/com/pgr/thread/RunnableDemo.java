package com.pgr.thread;

class Thread_F implements Runnable {

	@Override
	public void run() {// runnable state

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread_F a1 = new Thread_F();// new state
		Thread rA1 = new Thread(a1);
		rA1.start();// about to start run execution

		rA1.join();

		Thread_F a2 = new Thread_F();// new state
		Thread rA2 = new Thread(a2);
		rA2.start();// about to start run execution

	}
}
