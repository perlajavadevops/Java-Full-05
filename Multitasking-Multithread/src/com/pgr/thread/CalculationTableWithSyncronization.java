package com.pgr.thread;

public class CalculationTableWithSyncronization {

	public /* synchronized */ void printCalValues(int number) {
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(number + i);// 20
			}
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public /* synchronized */ static void additionCal(int number) {
		System.out.println("Static Methods " + Thread.currentThread().getName());
		synchronized (CalculationTableWithSyncronization.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(number + i);
			} // 20
		}
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
