
public class ExceptionDemo3 {

	public static void m()  {
		//try{
		int a  = 90/0;
		//}catch(ArithmeticException a){
			//a.printStackTrace();
		//}
		throw new ArithmeticException("/ is zero is not possible");
	}
	
	public static void main(String[] args) {
		m();
	}
}
