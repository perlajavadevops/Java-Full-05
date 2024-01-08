class ThreadPriorityA extends Thread {
	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class ThreadPriorityB extends Thread {
	@Override
	public void run() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadPriorityA threadPriorityA = new ThreadPriorityA();
		threadPriorityA.setPriority(8);
		threadPriorityA.start();
		System.out.println("threadPriorityA " + threadPriorityA.getPriority());

		// threadPriorityA.join();

		ThreadPriorityB threadPriorityB = new ThreadPriorityB();
		threadPriorityB.start();
		
		//threadPriorityB.start();
		threadPriorityB.setPriority(Thread.MIN_PRIORITY);
		System.out.println("threadPriorityB " + threadPriorityB.getPriority());

	}

}
