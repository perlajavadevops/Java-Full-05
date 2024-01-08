
public class CalculationTableThread_A extends Thread {

	CalculationTable calculationTable;

	/*
	 * public CalculationTableThread_A(CalculationTable calculationTable) {
	 * this.calculationTable = calculationTable; }
	 */

	@Override
	public void run() {
		
		//calculationTable.printCalValues(20);
		CalculationTable.additionCal(30);
	}
}
