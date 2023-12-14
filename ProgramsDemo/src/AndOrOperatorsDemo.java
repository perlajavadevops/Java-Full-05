
public class AndOrOperatorsDemo {

	public static void main(String[] args) {
		int a = 99;
		
		if(a%2==0)
			System.out.println("even");
		if(a%2==1)
			System.out.println("odd");
			//false	 true
		if(a > 90 || a >= 90 ) {
			System.out.println("Yes. it sati...");
		}else {
			System.out.println("No.");
		}
			//true	true
		if(a > 90 && a >= 90 ) {
			System.out.println("Yes. it sati...");
		}else {
			System.out.println("No.");
		}
		/*
		 * if (a > 90) { System.out.println("yes."); } else if (a >= 90) {
		 * System.out.println("Yes. it sati..."); } else { System.out.println("No."); }
		 */
		 
	}
}
//pi= 3.14
//write a program to check given number is prime number or not
//write a program to check given number is even number or not
//write a program to check given number is odd number or not

//write a promgram to print any pattern
/*
1 2 3 4
1 2 3
1 2 
1

1
1 2
1 2 3
1 2 3 4
1 2 3
1 2 
1

*/