import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapWithCustomObjectsSorting {

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2(101, "Reddy", 3030.00F, "TCS-12");
		Employee2 emp2 = new Employee2(102, "Dhatrika", 7000.5f, "TCS-13");
		Employee2 emp3 = new Employee2(103, "Karma", 4300.5f, "TCS-11");
		Employee2 emp4 = new Employee2(104, "Teja", 2300.5f, "TCS-10");
		Employee2 emp5 = new Employee2(105, "Confience", 2300.5f, "TCS-14");

		//HashMap<Employee2, String> map = new HashMap<Employee2, String>();
		TreeMap<Employee2, String> map = new TreeMap<Employee2, String>();
		map.put(emp1,"One");
		map.put(emp3,"Three");
		map.put(emp2,"Two");
		map.put(emp4,"Four");
		map.put(emp5,"Five");
		
		System.out.println("Using Iterator ");
		Set<Entry<Employee2,String>> set = map.entrySet();//it will convert map to Set

		Iterator<Entry<Employee2,String>> itr = set.iterator();
		while(itr.hasNext()){
			Entry<Employee2,String> entries = itr.next();
			System.out.print(entries.getKey()+" : ");
			System.out.println(entries.getValue());
			//entries.getValue().displayEmplyee();
		}

	}
}
