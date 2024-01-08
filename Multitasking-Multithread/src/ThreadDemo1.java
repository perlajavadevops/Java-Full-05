class ThreadA extends Thread {

	@Override
	public void run() {

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class ThreadB extends Thread {

	@Override
	public void run() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		ThreadA threadA1 = new ThreadA();
		// threadA1.run();

		threadA1.start();

		/*
		 * ThreadA threadA2 = new ThreadA(); threadA2.start();
		 */

		ThreadB threadB1 = new ThreadB();
		threadB1.start();

	}
}
