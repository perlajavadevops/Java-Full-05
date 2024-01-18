import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo_Methods {

	public static void main(String[] args) {
		HashSet<String> group1 = new HashSet<String>();

		group1.add("Dhatrika");
		group1.add("Mahesh");
		group1.add("GangiReddy");
		group1.add("Dhruvika");
		group1.add("Siri");

		HashSet<String> group2 = new HashSet<String>();

		group2.add("Siva");
		group2.add("Ganesh");
		group2.add("Alka");
		group2.add("Gaamika");
		group2.add("Siri");
		group2.add("Dhruvika");
		
		ArrayList<String> group3 = new ArrayList<String>(group1);

		group3.add("Dhatrika");
		group3.add("Mahesh");
		group3.add("GangiReddy");
		group3.add("Dhruvika");
		group3.add(0, "Siri");
		
		HashSet<String> group4 = new HashSet<String>(group3);
		
		//group1.remove(0);
		
		
		 Object[] arr =  group1.toArray();

		// List<String> list = Arrays.asList(arr);

		// Collections.sort(group1);

		// group1.sort
		group1.addAll(group2);

		// System.out.println(group1.containsAll(group2));

		 System.out.println(group1.retainAll(group2));

		 System.out.println(group1.isEmpty());
		 System.out.println(group1.contains("Siri"));

		System.out.println("=================");

		Iterator<String> itr = group1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			//itr.remove();
		}
		System.out.println("=================");
	}

}
