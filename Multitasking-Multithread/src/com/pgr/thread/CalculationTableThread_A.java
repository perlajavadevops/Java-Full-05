package com.pgr.thread;

public class CalculationTableThread_A extends Thread {

	CalculationTableWithoutSyncronization calculationTable;

	public CalculationTableThread_A(CalculationTableWithoutSyncronization calculationTable) {
		this.calculationTable = calculationTable;
	}

	@Override
	public void run() {
		calculationTable.printCalValues(20);
	}
}
