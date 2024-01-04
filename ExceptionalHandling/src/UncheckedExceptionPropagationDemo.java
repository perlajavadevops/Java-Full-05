
public class UncheckedExceptionPropagationDemo {

	public static void m(){
		int a = 10/0;
	}
	
	public static void n(){
		m();
	}
	
	public static void p(){
		try{
			n();
		}catch(ArithmeticException ie){
			System.out.println("Exception Handled");;
		}
		
		System.out.println("After Exception Handled --------");
	}
	
	public static void main(String[] args) {
		p();
	}
}
