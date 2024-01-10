package com.pgr.thread;

public class WithoutSyncronizationDemo2 {

	public static void main(String[] args) {

		CalculationTableWithoutSyncronization calculationTable = new CalculationTableWithoutSyncronization();

		CalculationTableThread_A thread_A = new CalculationTableThread_A(calculationTable);

		thread_A.start();

		CalculationTableThread_B thread_B = new CalculationTableThread_B(calculationTable);

		thread_B.start();

	}
}
