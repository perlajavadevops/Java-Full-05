
public class WithoutSyncronizationDemo {

	public static void main(String[] args) {
		
		CalculationTable calculationTable = new CalculationTable();
		//CalculationTableThread_A thread_A = new CalculationTableThread_A(calculationTable);
		CalculationTableThread_A thread_A = new CalculationTableThread_A();
		thread_A.start();
		
		//CalculationTableThread_B thread_B = new CalculationTableThread_B(calculationTable);
		CalculationTableThread_B thread_B = new CalculationTableThread_B();
		thread_B.start();
	}
}
