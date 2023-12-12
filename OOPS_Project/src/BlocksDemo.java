
public class BlocksDemo {

	static int s; 
	int a;
	//instance block
	{
		a = 80;
		System.out.println("instance block");
	}
	
	//static block
	static {
		s = 90;
		System.out.println("static block");
	}
	
	public BlocksDemo() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		BlocksDemo de = new BlocksDemo();
		System.out.println(de.a);
	}
}
