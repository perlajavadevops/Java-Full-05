import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Java", 1);
		map.put("Spring", 2);
		map.put("Servlet", 3);
		map.put("Rest", 4);
		map.put("Spring", 1);

		map.put("Hibernate", null);

		map.put("JDBC", null);
		// System.out.println(map);

		// System.out.println(map.size());
		// System.out.println(map.isEmpty());

		// to get only keys

		/*
		 * Set<String> setKeys = map.keySet(); Iterator<String> itr =
		 * setKeys.iterator(); while (itr.hasNext()) { System.out.println(itr.next()); }
		 */
		// to get only values
		/*
		 * Collection<Integer> val = map.values();
		 * 
		 * // List<Integer> val1 = (List<Integer>) val; Iterator<Integer> itr =
		 * val.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next()); }
		 */
		// to get keys, values

		Set<Entry<String, Integer>> setOfEntry = map.entrySet();

		Iterator<Entry<String, Integer>> itr = setOfEntry.iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
