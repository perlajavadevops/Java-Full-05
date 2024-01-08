
public class CalculationTable {

	public /* synchronized */ void printCalValues(int number) {

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(number + i);// 20
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static /* synchronized */  void additionCal(int number) {

		synchronized (CalculationTable.class) {
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
}
