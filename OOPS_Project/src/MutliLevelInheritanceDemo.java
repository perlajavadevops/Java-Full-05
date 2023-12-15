public class MutliLevelInheritanceDemo {

    public static void main(String[] args) {
       /* Nexton_EV ev = new Nexton_EV();
        ev.run();
        ev.changeGear();
        ev.uniqueFeatures();*/

      /*  NexonCar ev1 = new Nexton_EV();
        ev1.run();
        ev1.changeGear();
        ev1.uniqueFeatures(); */

       /* NexonCar ev2 = new NexonCar();
        ev2.run();
        ev2.changeGear();
        ev2.uniqueFeatures(); */

        TataMotors ev3 = new NexonCar();
        ev3.run();
        ev3.changeGear();
       // ev3.uniqueFeatures();

        TataMotors ev5 = new Nexton_EV();
        ev5.run();
        ev5.changeGear();
        //ev3.uniqueFeatures();

        if(ev5 instanceof NexonCar) {
        	System.out.println("yes....");
        }else {
        	System.out.println("no");
        }
       // ev5.uniqueFeatures();
    }
}
