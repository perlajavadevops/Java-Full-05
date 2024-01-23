import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapWithCustomObjects {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Reddy", 3030.00F, "TCS-12");
		Employee emp2 = new Employee(102, "Dhatrika", 7000.5f, "TCS-13");
		Employee emp3 = new Employee(103, "Karma", 4300.5f, "TCS-11");
		Employee emp4 = new Employee(100, "Teja", 2300.5f, "TCS-10");
		Employee emp5 = new Employee(100, "Confience", 2300.5f, "TCS-14");

		TreeMap<Employee, String> map = new TreeMap<Employee, String>();
		map.put(emp1, "One");
		map.put(emp3, "Three");
		map.put(emp2, "Two");
		map.put(emp4, "Four");
		map.put(emp5, "Five");

		System.out.println("Using Iterator ");
		Set<Entry<Employee, String>> set = map.entrySet();// it will convert map to Set

		Iterator<Entry<Employee, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Employee, String> entries = itr.next();
			System.out.print(entries.getKey() + " : ");
			System.out.println(entries.getValue());
			// entries.getValue().displayEmplyee();
		}

	}
}
