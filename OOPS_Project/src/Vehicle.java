public class Vehicle {

	public int speedLimit = 90;

	public Vehicle() {
		System.out.println("Vehicle CLass constr");
	}
	public void run() {
		System.out.println("Vehicle is running with " + speedLimit);
	}

	public void changeGear() {
		System.out.println("Vehicle Gear changed");
	}

}
