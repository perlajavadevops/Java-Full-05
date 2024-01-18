import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		// al.en
		al.add(10);
		al.add(10);// Integer
		al.add(20);// Double
		al.add(30);// Character
		al.add(40);// Boolean
		al.add(30);// String

		//System.out.println(al.size());
		// Integer[] all = (Integer[]) al.toArray();
		// System.out.println(al.);
		// System.out.println(al.get(4));
		// System.out.println(al);

		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); }
		 */
		
		/*
		 * for(int i : al) { System.out.println(i); }
		 */

		/*
		 * Iterator<Integer> itr = al.iterator();//forward direction backward direction
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		
		//ListIterator<Integer> listItr = al.listIterator();
		/*
		 * while (listItr.hasNext()) {//foward direction
		 * System.out.println(listItr.next()); }
		 */
		/*
		 * System.out.println("============================"); while
		 * (listItr.hasPrevious()) {//backward direction
		 * System.out.println(listItr.previous()); }
		 */
		
		//al.forEach(a -> System.out.println(a));
	}
}
