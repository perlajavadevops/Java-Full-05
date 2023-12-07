
public class VariablesDemo1 {

	//instance variables -- object variables. --> object level
	int count = 1;//declared variable name + inilizated value
	int speed; //Declaration
	
	//static variables -- class level variables. --> class level
	static int limit = 100;
	// \u0000
	public static void main(String[] args) {
		int a = 90;//local var
		System.out.println(a);
		System.out.println(VariablesDemo1.limit);//static varaibles can be accessed using class name.
		
		//create a object and then we need call the vari
		VariablesDemo1 demo1 = new VariablesDemo1();//constructor
		System.out.println(demo1.count);
		System.out.println(demo1.speed);
	}
}
