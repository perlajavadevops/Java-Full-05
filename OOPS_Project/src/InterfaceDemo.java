interface C {

	void m();

	public static final int SPEED = 90;

	// java 8 -- default and static methods also

}

class D implements C {

	@Override
	public void m() {
		System.out.println("Implmemenatin .....");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		C cObj = new D();
		cObj.m();
		
		new C() {
			@Override
			public void m() {
				System.out.println("kkk");
			}
		};
	}

}