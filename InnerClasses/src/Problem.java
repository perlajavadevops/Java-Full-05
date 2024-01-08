public class Problem {
	 String s = null;

	 class Inner {
		 void testMethod() {
			s = "Set from Inner";
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		Problem p = new Problem();
		p.s = "Reddy";
		System.out.println(p.s);
		Problem.Inner in =p.new Inner(); 
		in.testMethod();
	}
}