import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Dhatrika");
		set.add("Mahesh");
		set.add("GangiReddy");

		set.add("Dhruvika");
		set.add("Dhruvika");

		// System.out.println(set.add("Dhruvika"));
		set.add(null);
		set.add(null);

		/*
		 * for (String obj : set) { System.out.println(obj); }
		 */

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			//set.remove("Dhatrika");
			System.out.println(itr.next());
			itr.remove();
		}

	}

}
