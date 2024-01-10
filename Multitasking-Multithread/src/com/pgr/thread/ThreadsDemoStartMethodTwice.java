package com.pgr.thread;

class Thread_D extends Thread {

	@Override
	public void run() {//runnable state
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

class Thread_E extends Thread {

	@Override
	public void run() {//runnable state
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadsDemoStartMethodTwice {

	public static void main(String[] args) throws InterruptedException {
		Thread_D a1 = new Thread_D();//new state
		a1.start();//about to start run execution
		//a1.start();
		a1.join();
		
		Thread_E a2 = new Thread_E();//new state
		
		a2.start();//about to start run execution
		
	}
}
