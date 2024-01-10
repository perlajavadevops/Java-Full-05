package com.pgr.thread;

public class CalculationTableThread_A_Sync extends Thread {

	CalculationTableWithSyncronization calculationTable;

	public CalculationTableThread_A_Sync(CalculationTableWithSyncronization calculationTable) {
		this.calculationTable = calculationTable;
	}

	@Override
	public void run() {
		//calculationTable.printCalValues(20);
		CalculationTableWithSyncronization.additionCal(100);
		
	}
}
