public class Car extends Vehicle{


   // public int speedLimit = 100;
	
	Car(int a){
		System.out.println(a);
	}
	public Car() {
		super();
		//this(10);
		System.out.println("Car CLass Constr");
	}
	@Override
	public void run() {
		
		System.out.println("Car is running " + super.speedLimit);
	}
	 
	public void amtGear() {
		super.changeGear();
		System.out.println("Car is running with AMT " + speedLimit);
	}

}
