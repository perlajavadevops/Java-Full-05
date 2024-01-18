import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Dhatrika");
		set.add("Mahesh");
		set.add("GangiReddy");

		set.add("Dhruvika");
		set.add("Dhruvika");

		// System.out.println(set.add("Dhruvika"));

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
