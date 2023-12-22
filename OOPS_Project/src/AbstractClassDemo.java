abstract class A{
	public abstract void m();
}

class B extends A{

	@Override
	public void m() {
		System.out.println("Sb ....");
	}
}

public class AbstractClassDemo {

	
	public static void main(String[] args) {
		
		A a = new B();
		a.m();
		
		B b = new B();
		b.m();//java AbstractClassDemo
		
		
	}
}
