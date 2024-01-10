package com.pgr.thread;

public class CalculationTableThread_B extends Thread {

	CalculationTableWithoutSyncronization calculationTable;

	public CalculationTableThread_B(CalculationTableWithoutSyncronization calculationTable) {
		this.calculationTable = calculationTable;
	}

	@Override
	public void run() {

		calculationTable.printCalValues(50);
	}
}
