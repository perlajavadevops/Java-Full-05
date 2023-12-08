
public class Student_Constructor_Overloading {

	// data members
	public int sno;// declared
	public String name;// declared
	public String collage;
	// Constructor - 0 arg con
	//this, 

	Student_Constructor_Overloading() {
		System.out.println("0-arg constrocr");
	}

	Student_Constructor_Overloading(int i) {
		System.out.println("1-arg constrocr (int)");
	}

	Student_Constructor_Overloading(String  n) {
		System.out.println("0-arg constrocr (String) ");
	}
	
	// Parameterized Constructor
	Student_Constructor_Overloading(int s, String n, String c) {
		System.out.println("3-parameterized const");
		sno = s;
		name = n;
		collage = c;
		System.out.println("Constr");
	}

	public static void main(String[] args) {

		Student_Constructor_Overloading st = new Student_Constructor_Overloading(101, "Rd", "XYZ");// st -- ojbect
																									// reference
																									// varaible.
		/*
		 * st.name = "Gangadhar"; st.sno = 900; st.collage = "ABC";
		 */
		System.out.println(st.name);// null
		System.out.println(st.sno);
		System.out.println(st.collage);

	}
}
