package com.pgr.thread;

public class WithSyncronizationDemo {

	public static void main(String[] args) {

		CalculationTableWithSyncronization calculationTable = new CalculationTableWithSyncronization();

		CalculationTableThread_A_Sync thread_A = new CalculationTableThread_A_Sync(calculationTable);

		thread_A.start();

		CalculationTableThread_B_Sync thread_B = new CalculationTableThread_B_Sync(calculationTable);

		thread_B.start();

	}
}
