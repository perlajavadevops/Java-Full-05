package com.pgr.thread;

public class CalculationTableThread_B_Sync extends Thread {

	CalculationTableWithSyncronization calculationTable;

	public CalculationTableThread_B_Sync(CalculationTableWithSyncronization calculationTable) {
		this.calculationTable = calculationTable;
	}

	@Override
	public void run() {

		// calculationTable.printCalValues(50);
		CalculationTableWithSyncronization.additionCal(200);
	}
}
