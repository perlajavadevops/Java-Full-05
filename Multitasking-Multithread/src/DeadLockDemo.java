
public class DeadLockDemo {

	public static void main(String[] args) {

		String user1 = "Dhatrika";
		String user2 = "PerlaReddy";

		Runnable runable1 = new Runnable() {

			@Override
			public void run() {
				synchronized (user1) {
					System.out.println("Thread 1 : Locked " + user1);

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (user2) {
						System.out.println("Thread 1 : Locked " + user2);
					}
				}
			}
		};

		Thread threadA = new Thread(runable1);
		threadA.start();

		Runnable runable2 = new Runnable() {

			@Override
			public void run() {
				synchronized (user2) {
					System.out.println("Thread 2 : Locked " + user2);

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (user1) {
						System.out.println("Thread 1 : Locked " + user1);
					}
				}
			}
		};

		Thread threadB = new Thread(runable2);
		threadB.start();
	}
}
