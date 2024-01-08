
public class DeamonThreadDemo {

	public static void main(String[] args) {
		Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());
		/*
		 * Thread th1 = new Thread() { public void run() {
		 * 
		 * for (int i = 0; i < 10; i++) { System.out.println(i); }
		 * 
		 * };
		 * 
		 * };
		 * 
		 * Thread th2 = new Thread() { public void run() {
		 * 
		 * for (int i = 10; i < 20; i++) { System.out.println(i); }
		 * 
		 * };
		 * 
		 * };
		 * 
		 * 
		 * th1.setDaemon(true); th1.start();
		 * 
		 * th2.start();
		 * 
		 * System.out.println(th1.isDaemon()); System.out.println(th2.isDaemon());
		 * System.out.println(th1.getPriority()); System.out.println(th2.getPriority());
		 */
	}
}
