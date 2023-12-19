public class StaticBindingDemo {

	private int sno = 90;
	
    private static void m(){
        System.out.println("private method...");
    }

    public static void main(String[] args) {
        StaticBindingDemo demo = new StaticBindingDemo();
        demo.m();
    }
}

class OtherStaticBinding{
    public static void main(String[] args) {
        StaticBindingDemo demo = new StaticBindingDemo();
       // System.out.println(StaticBindingDemo.sno);
        //demo.m();
    }
}
