public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {
        TataMotors tataCars = new TataCar();//
        TataMotors tataTrucks = new TataTrucks();
        TataMotors tataBus = new TataBus();
        //instanceof
        System.out.println(tataCars instanceof TataMotors);
        System.out.println(tataCars instanceof TataCar);
        if(tataCars instanceof TataTrucks) {
        	System.out.println("yes....");
        }else {
        	System.out.println("no");
        }
      //  TataCar car =  new TataBus();
    }
}
