
public class Student {

	// data members
	public int sno;// declared
	public String name;// declared
	public String collage;

	// Constructor - 0 arg con

	Student() {
		System.out.println("Constr");
	}

	// Parameterized Constructor

	Student(int s, String n, String c) {

		sno = s;
		name = n;
		collage = c;

		System.out.println("Constr");
	}

	public static void main(String[] args) {

		Student st = new Student(101, "Rd", "XYZ");// st -- ojbect reference varaible.
		/*
		 * st.name = "Gangadhar"; st.sno = 900; st.collage = "ABC";
		 */

		System.out.println(st.name);// null
		System.out.println(st.sno);
		System.out.println(st.collage);

	}
}
