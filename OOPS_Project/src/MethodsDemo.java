
public class MethodsDemo {

	// 1. instance method
	// 2. static method
	
	// instance method
	public void getStudentDetails() { // getStudentDetails
		System.out.println("instance mehtod....");
	}

	// static method
	public static void setStudentDetails() { // getStudentDetails
		System.out.println("static mehtod....");
		//method calling
	}
	
	public static void main(String[] args) {
		MethodsDemo.setStudentDetails();//
		MethodsDemo demo = new MethodsDemo();
		demo.getStudentDetails();
		
		System.out.println(demo.toString());//gangadharjava@gmail.com
		System.out.println(demo.hashCode());
	}
}
