
class A{
	
	
	private int a = 90;
		
	//Instance inner class
	class InnerB{//A$InnerB.class
		
		//static int i = 0; // not possilbe
		
		/*public static  void n(){ // not Possible
			System.out.println(a);
		}*/

		public void n(){
			System.out.println(a);
		}
		
	}
	
	interface InnerInterface{
		void in();
	}
	
	class SubClass implements InnerInterface{
		@Override
		public void in() {
			System.out.println("Inner Interface Demo");
		}
	}
	
	//static inner class
	static class StaticInnerB{//A$StaticInnerB
		int b;
		
		public static void q(){
			System.out.println("Demo");
		}
		
		public void nonM(){
			System.out.println("non M method");
		}
	}
	
	public void m(){
		
		//Local inner class
		class LocalB{
			public void s(){
				System.out.println("Local method s");
			}	
			
		}
		
		LocalB localB = new LocalB();
		localB.s();
	}
}
public class OutterDemo { //lambda functions

	public static void main(String[] args) {
		A aObject = new A();
		A.InnerB innerB = aObject.new InnerB();//Inner instance class object creation
		innerB.n();
		aObject.m();
		
		A.StaticInnerB.q();
		
		A.StaticInnerB staticB = new A.StaticInnerB();
		staticB.nonM();
		
		
		A.InnerInterface inter= aObject.new SubClass();
		inter.in();
		
		
		//System.out.println(aObject.a);
	}
}
