package com.pgr.thread;

class Thread_A extends Thread {

	@Override
	public void run() {//runnable state
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Thread_A a1 = new Thread_A();//new state
		a1.setName("Dhatrika");
		System.out.println(a1.getName());
		a1.start();//about to start run execution
		
		a1.join();
		
		Thread_A a2 = new Thread_A();//new state
		a2.setName("Dhruvika");
		System.out.println(a2.getName());
		a2.start();//about to start run execution
		
	}
}
