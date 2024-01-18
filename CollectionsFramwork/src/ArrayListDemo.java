import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Reddy", 8080808080L, 3030.00F);
		Employee emp2 = new Employee(102, "Dhatrika", 707070707070L, 4000.5f);
		ArrayList<Employee> al = new ArrayList<Employee>();
		// LinkedList<Employee> al = new LinkedList<Employee>();
		// Vector<Employee> al = new Vector<Employee>();
		al.add(emp2);
		al.add(emp1);
		//al.add(emp1);

		System.out.println("Using Iterator ");
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			employee.displayEmplyee();
		}

		/*
		 * Enumeration<Employee> en = al.elements(); while (en.hasMoreElements()) {
		 * Employee employee = (Employee) en.nextElement(); employee.displayEmplyee(); }
		 */
	}
}
