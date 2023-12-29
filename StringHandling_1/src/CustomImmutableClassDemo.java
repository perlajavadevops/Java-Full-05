
final class CustomeImmuable{
	//1. final class
	//2.private final variable
	//3. only getter method is required... we should not have setter method for final variables
	
	private final int speed;
	
	public CustomeImmuable(int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	
	
}

public class CustomImmutableClassDemo {
	

	public static void main(String[] args) {
		CustomeImmuable customeImmuable = new CustomeImmuable(100);
		System.out.println(customeImmuable.getSpeed());
	}
}
