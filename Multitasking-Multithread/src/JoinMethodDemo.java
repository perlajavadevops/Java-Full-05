class JoinThreadA extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class JoinThreadB extends Thread {
	@Override
	public void run() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class JoinMethodDemo {
	
	public static void main(String[] args) throws InterruptedException {
		JoinThreadA joinThreadA = new JoinThreadA();
		joinThreadA.start();
		
		joinThreadA.join();
		
		JoinThreadB joinThreadB = new JoinThreadB();
		joinThreadB.start();
	}

}
