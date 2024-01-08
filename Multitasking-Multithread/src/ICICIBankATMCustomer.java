
public class ICICIBankATMCustomer {

	long amount = 20000;

	public synchronized void withdraw(long amount) {// 30000

		System.out.println("going to withdraw the amount..");
		if (this.amount < amount) {
			System.out.println("Less Balance....+"+this.amount+"+ waiting for deposite the amount..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.amount -= amount;
			

			System.out.println("Withdraw completed.............");
		}

	}

	public synchronized void deposite(long amount) {// 30000

		System.out.println("going to deposite the amount..");

		this.amount += amount;

		System.out.println("Deposite completed.............");
		
		notify();

	}
	
	public static void main(String[] args) {
		
		ICICIBankATMCustomer iciciBankATMCustomer = new ICICIBankATMCustomer();
		
		new Thread() {
			public void run() {
				iciciBankATMCustomer.withdraw(30000);
			};
			
		}.start();
		
		new Thread() {
			public void run() {
				iciciBankATMCustomer.deposite(20000);
			};
			
		}.start();
	}
}
