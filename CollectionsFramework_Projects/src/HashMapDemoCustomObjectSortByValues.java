
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class HashMapDemoCustomObjectSortByValues {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Employee2 emp1 = new Employee2(101, "Reddy", 3030.00F, "TCS-12");
		Employee2 emp2 = new Employee2(102, "Dhatrika", 7000.5f, "TCS-13");
		Employee2 emp3 = new Employee2(103, "Karma", 4300.5f, "TCS-11");
		Employee2 emp4 = new Employee2(104, "Teja", 2300.5f, "TCS-10");
		Employee2 emp5 = new Employee2(105, "Confience", 2300.5f, "TCS-14");

		HashMap<String, Employee2> map = new HashMap<String, Employee2>();
		map.put("One", emp1);
		map.put("Three", emp3);
		map.put("Two", emp2);
		map.put("Four", emp4);
		map.put("Five", emp5);

		ArrayList<Employee2> values = new ArrayList<Employee2>();
		Collection<Employee2> coll = map.values();
		Iterator<Employee2> itr = coll.iterator();
		while (itr.hasNext()) {
			Employee2 type = (Employee2) itr.next();
			values.add(type);
			// System.out.println(type);
		}
//		/System.out.println("before sorting "+values);
		values.sort(new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		/*
		 * Collections.sort(values, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 * }
		 * 
		 * });
		 */

		// System.out.println("after sorting "+values);

		LinkedHashMap<String, Employee2> map3 = new LinkedHashMap<String, Employee2>();

		for (Employee2 val : values) {

			for (Map.Entry<String, Employee2> ent : map.entrySet()) {
				if (ent.getValue().getName().equals(val.getName())) {
					map3.put(ent.getKey(), val);
				}
			}
		}
		//System.out.println(map3);
		ConcurrentHashMap<String, Employee2> map4 = new ConcurrentHashMap<String, Employee2>(map3);
		//map4.put(null, null); not possible
		System.out.println("Using Iterator ");
		Set<Entry<String, Employee2>> set2 = map4.entrySet();// it will convert map to Set

		Iterator<Entry<String, Employee2>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			map4.remove("Three");
			Entry<String, Employee2> entries = itr2.next();
			System.out.print(entries.getKey() + " : ");
			System.out.println(entries.getValue());
			// entries.getValue().displayEmplyee();
		}

	}
}
