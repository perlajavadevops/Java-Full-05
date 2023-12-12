
public class Student_Constructor_Overloading {

	// data members
	public int sno;// declared
	public String name;// declared
	public String collage;
	// Constructor - 0 arg con
	//this, 

	Student_Constructor_Overloading() {
		//this("ss");
		System.out.println("0-arg constrocr");
	}

	Student_Constructor_Overloading(int i) {
		this();
		System.out.println("1-arg constrocr (int)");
	}

	Student_Constructor_Overloading(String  n) {
		this(100);
		System.out.println("1-arg constrocr (String) ");
	}
	
	// Parameterized Constructor
	Student_Constructor_Overloading(int sno, String name, String collage) {
	
		this("St");//Constructor Chaining.
		
		System.out.println("3-parameterized const");
		
	
		this.sno = sno;
		this.name = name;
		this.collage = collage;
		System.out.println("Constr");
	}

	public static void main(String[] args) {

		Student_Constructor_Overloading st = new Student_Constructor_Overloading(101, "Rd", "XYZ");// st -- ojbect
																							// reference
																									// varaible.
		//Student_Constructor_Overloading st1 = new Student_Constructor_Overloading();
		/*
		 * st.name = "Gangadhar"; st.sno = 900; st.collage = "ABC";
		 */
		System.out.println(st.name);// null
		System.out.println(st.sno);
		System.out.println(st.collage);

	}
}
