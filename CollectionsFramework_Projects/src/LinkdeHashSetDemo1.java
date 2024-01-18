import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkdeHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
