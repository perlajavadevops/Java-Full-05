class RunnableA implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}

class RunnableB implements Runnable {

	@Override
	public void run() {

		try {
			Thread.sleep(20000);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}

	}

}

public class RunnableDemo1 {

	public static void main(String[] args) {
		RunnableA runnableA1 = new RunnableA();
		Thread threadA = new Thread(runnableA1);
		threadA.setName("Dhatrika");
		System.out.println("threadA id "+threadA.getId());
		System.out.println(threadA.getName());
		threadA.start();
		RunnableB runnableB1 = new RunnableB();
		Thread threadB = new Thread(runnableB1);
		System.out.println(threadB.getState());
		threadB.setName("Dhruvika");

		System.out.println(threadB.getName());
		threadB.start();
		System.out.println(threadB.getState());
	}
}
