import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class CustomObjectsCollectionDemo2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Dhana", 2000, "9000000000");
		Employee emp2 = new Employee(102, "Siva", 3000, "4000000000");
		Employee emp3 = new Employee(103, "Dhruvika", 4000, "3000000000");
		Employee emp4 = new Employee(104, "Mahesh", 1000, "2000000000");
		Employee emp5 = new Employee(101, "Dhana", 2000, "9000000000");

		//HashSet<Employee> empCollection = new HashSet<Employee>();

		//List<Employee> empCollection = new ArrayList<Employee>();

		TreeSet<Employee> empCollection = new TreeSet<Employee>();
		
		empCollection.add(emp1);
		empCollection.add(emp2);
		empCollection.add(emp4);
		empCollection.add(emp3);
		empCollection.add(emp5);
		empCollection.add(emp1);

		//Collections.sort(empCollection);
		
		Iterator<Employee> itr = empCollection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
