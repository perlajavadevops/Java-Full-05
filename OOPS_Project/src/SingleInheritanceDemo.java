public class SingleInheritanceDemo {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.run();
		vehicle.changeGear();
		//vehicle.amtGear();
		System.out.println(vehicle.speedLimit);

		Car car = new Car();
		car.run();
		car.changeGear();
		car.amtGear();
		System.out.println(car.speedLimit);
		
		Vehicle car1 = new Car();
		System.out.println(car1);
		car1.run();
		car1.changeGear();
		//car1.amtGear();
		System.out.println(car1.speedLimit);
		
		//Car car2 = new Vehicle();//it is not possible
		/*
		 * Car car = new Car(); car.run();//Runtime Poly
		 * 
		 * 
		 * //car.changeGear(); System.out.println(car.speedLimit); // car.amtGear();
		 * 
		 * System.out.println("Car car obj "+car);
		 * 
		 * Vehicle car1 = new Car();// System.out.println("Car car1 obj "+car1);
		 * car1.run();//Runtime Poly // car1.changeGear();
		 * System.out.println(car1.speedLimit); //car1.amtGear();
		 * 
		 * Vehicle car2 = new Vehicle();// System.out.println("Car car2 obj "+car2);
		 * car1.run();//Runtime Poly //car1.changeGear();
		 * System.out.println(car1.speedLimit); //car2.amtGear();
		 * 
		 * //Car car3 = new Vehicle();// it is not possible
		 */
	}
}
