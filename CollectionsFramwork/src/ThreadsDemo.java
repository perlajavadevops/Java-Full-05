import java.util.Iterator;
import java.util.List;

//Thread class and Runnable interface

class ThreadA extends Thread {

	ProductListDemo listDemo;

	@Override
	public void run() {// Runnable State
		listDemo = new ProductListDemo();
		List<Product> list = listDemo.getList();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product product = (Product) itr.next();
			System.out.println(product.toString());
		}
	}

}

class ThreadB extends Thread {

	ProductListDemo listDemo;

	@Override
	public void run() {// Runnable State
		listDemo = new ProductListDemo();
		List<Product> list = listDemo.getList();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product product = (Product) itr.next();
			System.out.println(product.toString());
		}
	}

}

public class ThreadsDemo {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();// new state
		threadA.start();// starting state

		ThreadB threadB = new ThreadB();// new state
		threadB.start();// starting state

	}
}
