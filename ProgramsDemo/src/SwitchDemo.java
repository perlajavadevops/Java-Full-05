
public class SwitchDemo {

	public static void main(String[] args) {
		int a = 100;
		
		//

		String weekName = "Monday";
		
		switch (weekName) {
		case "Monday":
			System.out.println("today is "+weekName);
			break;
		default:
			System.out.println("the value is "+a);
			break;
		}
		
		switch (a) {
		case 80:
			System.out.println("values is 80");
			break;
		case 90:
			System.out.println("values is 90");
			break;
		default:
			System.out.println("the value is "+a);
			break;
		}
		/*
		 * if (a > 90) { System.out.println("yes."); } else if (a >= 90) {
		 * System.out.println("Yes. it sati..."); } else { System.out.println("No."); }
		 */
	}
}
//pi= 3.14