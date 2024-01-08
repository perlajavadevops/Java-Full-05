
public class CalculationTableThread_B extends Thread{

	CalculationTable calculationTable;

	/*
	 * public CalculationTableThread_B(CalculationTable calculationTable) {
	 * this.calculationTable = calculationTable; }
	 */

	@Override
	public void run() {
		
		//calculationTable.printCalValues(50);
		CalculationTable.additionCal(60);
	}
}
