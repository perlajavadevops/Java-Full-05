
public class OutterInterfaceDemo {

	public interface InnerA{
		public void m();
		
	}
	
	/*class InnerC implements InnerA{
		@Override
		public void m() {
			System.out.println("Inner Interface demo");
		}
	}*/
	
	public static void main(String[] args) {
		OutterInterfaceDemo demo = new OutterInterfaceDemo();
		new InnerA(){//
			@Override
			public void m() {
				System.out.println("Hi");				
			}
		}.m();
		
	}
}
