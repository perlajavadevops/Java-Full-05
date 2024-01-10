package com.pgr.thread;

class Thread_C extends Thread {

	@Override
	public void run() {//runnable state
		
		try {
			Thread.sleep(3000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadsDemoWithoutStartMethod {

	public static void main(String[] args) throws InterruptedException {
		Thread_C a1 = new Thread_C();//new state
		a1.start();//about to start run execution
		//a1.run();
		//a1.join();
		
		//Thread_C a2 = new Thread_C();//new state
		
		//a2.start();//about to start run execution
		
	}
}
