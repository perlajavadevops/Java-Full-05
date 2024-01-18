import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_Generic {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// al.add(10);
		// al.add(true);
		al.add("Dhatrika");
		al.add("Mahesh");
		al.add("GangiReddy");
		al.add("Dhruvika");
		// al.add(70.90);

		al.add(0, "Siri");

		// System.out.println(al);

		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); }
		 */
		/*
		 * System.out.println("=============="); for (String obj : al) {
		 * System.out.println(obj); }
		 */
		System.out.println("=================");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
			itr.remove();
		}

		/*
		 * System.out.println("=========================="); ListIterator<String>
		 * listItr = al.listIterator(); while (listItr.hasNext()) {
		 * 
		 * System.out.println(listItr.next()); } System.out.println("===========");
		 * while (listItr.hasPrevious()) {
		 * 
		 * System.out.println(listItr.previous()); }
		 */

//		/System.out.println(al.size());

	}

}
