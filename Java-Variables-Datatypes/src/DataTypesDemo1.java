
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
		System.out.println("int "+i);//
		System.out.println("byte "+b);//
		System.out.println("short "+s);//
		System.out.println("long "+l);//
		System.out.println("float "+f);//
		System.out.println("double "+d);//
		System.out.println("boolean "+bool);//
		System.out.println("char :"+ch);
	}
	
}
