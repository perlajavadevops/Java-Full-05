import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("One", "Karma");
		map1.put("Two", "Reddy");
		map1.put("Four", "Dhatrika");
		map1.put("TwoT", "Siva");
		map1.put("TwoT", "Siva ");
		map1.put("TwoQ", "Teja");
		map1.put(null, null);
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Three", "Gangi");
		map2.put("Five", "Perla");
		
		//System.out.println(map1.size());
		//map1.putAll(map2);
		
		/*
		 * System.out.println(map2.containsValue("Perla"));
		 * System.out.println(map2.containsKey("Five"));
		 */
		
		//map1.clear();
		//System.out.println(map1.isEmpty());
		
		//map1.remove("TwoQ");
		
		/*
		 * for(int i = 0; i<map1.size(); i++) { System.out.println(map1.get(i)); }
		 */
		/*
		 * for (Map.Entry<keyType, valType> entry : map.entrySet()) { keyType key =
		 * entry.getKey(); valType val = entry.getValue();
		 * 
		 * }
		 */

		
		  Set<Map.Entry<String, String>> set = map1.entrySet();

			/*
			 * for (Iterator<Entry<String, String>> iterator = set.iterator();
			 * iterator.hasNext();) { Entry<String, String> entry = iterator.next();
			 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
			 */
		/*
		 * Iterator<Map.Entry<String, String>> itr = set.iterator(); while
		 * (itr.hasNext()) { Map.Entry<String, String> type = itr.next();
		 * System.out.println(type.getKey() + " : " + type.getValue()); }
		 */

		/* Set<String> set = map1.keySet();

			Iterator<String> itr = set.iterator();
			while (itr.hasNext()) {
				String type = (String) itr.next();
				System.out.println(type);
			}
		 */

		/*ArrayList<String> values = new ArrayList<String>();
		Collection<String> coll = map1.values();
		//ArrayList<String> coll = (ArrayList<String>) map1.values();
		Iterator<String> itr = coll.iterator();
		while (itr.hasNext()) {
			String type = (String) itr.next();
			values.add(type);
			System.out.println(type);
		}*/

		// System.out.println(keySets);
		// System.out.println(map1);
	}
}
