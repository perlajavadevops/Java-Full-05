public class RuntimePolyDemo {
    public static void main(String[] args) {
        Bike bike1 = new Honda();
        bike1.run();


        //Hero honda = (Hero)bike1;//it will give runtime excepiton
        //honda.run();
        //honda.uniqueFeatures();
        Bike bike2 = new Hero();
        bike2.run();

        Honda honda1 = new Honda();

        Bike bike3 = honda1;
        System.out.println(bike3 instanceof Hero);
        if(bike3 instanceof Hero) {
        	  Hero hero = (Hero)bike3;
        }
      
        bike3.run();
    }
}
