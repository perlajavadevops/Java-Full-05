
public class DataTypesDemo1 {

	static int i = 999999999;
	static byte b;//-128 to -127
	static short s;//32000
	static long l = 999999999990000000L;
	static float f = 12.90f;
	static double d = 89.90;
	static boolean bool = true;
	static char ch = 'b';
	
	// \u0000 -->  
	
	public static void main(String[] args) {
		System.out.println("int "+i);//0
		System.out.println("byte "+b);//0
		System.out.println("short "+s);//0
		System.out.println("long "+l);//0
		System.out.println("float "+f);//0.0
		System.out.println("double "+d);//0.0
		System.out.println("boolean "+bool);//false
		System.out.println("char :"+ch);// '/u0000'//  
	}
	
}
