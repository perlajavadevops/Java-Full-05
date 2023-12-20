public class FinalVariablesDemo {

	
    //final int price = 100;
    final int price1;

    //static final int price = 80;
    //static final int price;

    public static final double PI_VALUE = 3.14;//Constants

	/*
	 * static{ price = 70; }
	 * 
	 * { price1 = 50; }
	 */

	public FinalVariablesDemo(int price1) {
		this.price1 = price1;
	}

    public static void main(String[] args) {
        FinalVariablesDemo fineVarDemo = new FinalVariablesDemo(200);
        //fineVarDemo.price1 = 90;
        //FinalVariablesDemo.price = 300;
        System.out.println(fineVarDemo.price1);

		
		 //FinalVariablesDemo demo = new FinalVariablesDemo();
		 //demo.price = 90;
		 //System.out.println(demo.price);
		 /** 
		 * FinalVariablesDemo demo1 = new FinalVariablesDemo();
		 * System.out.println(demo.price1);
		 * 
		 * System.out.println(FinalVariablesDemo.price);
		 * System.out.println(FinalVariablesDemo.price);
		 */
    }
}
