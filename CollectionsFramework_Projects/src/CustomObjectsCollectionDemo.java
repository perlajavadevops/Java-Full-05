import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CustomObjectsCollectionDemo {

	public static void main(String[] args) {
		
		  Employee emp1 = new Employee(101, "Dhana", 2000, "9000000000"); Employee emp2
		  = new Employee(102, "Siva", 3000, "4000000000"); Employee emp3 = new
		  Employee(103, "Dhruvika", 4000, "3000000000"); Employee emp4 = new
		  Employee(104, "Mahesh", 1000, "2000000000"); Employee emp5 = new
		  Employee(101, "Dhana", 2000, "9000000000");
		 
		
			/*
			 * Employee2 emp1 = new Employee2(101, "Dhana", 2000, "9000000000"); Employee2
			 * emp2 = new Employee2(102, "Siva", 3000, "4000000000"); Employee2 emp3 = new
			 * Employee2(103, "Dhruvika", 4000, "3000000000"); Employee2 emp4 = new
			 * Employee2(104, "Mahesh", 1000, "2000000000"); Employee2 emp5 = new
			 * Employee2(101, "Dhana", 2000, "9000000000");
			 */

		//ArrayList<Employee2> empCollection = new ArrayList<Employee2>();
		
		HashSet<Employee> empCollection = new HashSet<Employee>();
		
		//ArrayList<Employee> empCollection = new ArrayList<Employee>();
		
		empCollection.add(emp1);
		empCollection.add(emp2);
		empCollection.add(emp4);
		empCollection.add(emp3);
		empCollection.add(emp5);
		empCollection.add(emp1);
		
		  Iterator<Employee> itr = empCollection.iterator(); while (itr.hasNext()) {
		  System.out.println(itr.next()); }
		 

		/*
		 * Iterator<Employee2> itr = empCollection.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */

	}

}
