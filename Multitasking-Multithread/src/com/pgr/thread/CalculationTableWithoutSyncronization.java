package com.pgr.thread;

public class CalculationTableWithoutSyncronization {

	public void printCalValues(int number) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(number + i);// 20
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public static void additionCal(int number) {
	 * 
	 * synchronized (CalculationTableWithoutSyncronization.class) { for (int i = 0;
	 * i < 5; i++) { System.out.println(number + i);// 20 } } try {
	 * Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
	 * 
	 * }
	 */
}
