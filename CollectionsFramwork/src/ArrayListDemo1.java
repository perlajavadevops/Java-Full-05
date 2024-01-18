import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		//HashSet<Integer> al = new HashSet<Integer>();

		al.add(101);
		al.add(102);
		al.add(104);
		al.add(100);
		al.add(100);

		//Collections.synchronizedSet(al);
		System.out.println("Before Sorting");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			//al.remove(1);
			System.out.println(itr.next());
		}

		//al.sort(null);
		Collections.sort(al);
		
		System.out.println("After Sorting");
		Iterator<Integer> itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		/*
		 * ArrayList<Integer> al1 = new ArrayList<Integer>(al); Collections.sort(al1);
		 * 
		 * System.out.println("After Sorting"); Iterator<Integer> itr1 = al.iterator();
		 * while (itr1.hasNext()) { System.out.println(itr1.next()); }
		 */		/*
		 * ArrayList<Integer> al2 = new ArrayList<Integer>(); //al2.add(1,105);//Adding
		 * based on position (Index based) al2.add(106); al2.add(107); al2.add(104);
		 * al2.add(100);
		 */

		// Clear all elements from the list
		// al.clear();
		// Adding one list to another list
		// al.addAll(al2);
		// Removing one list to another list
		// al.removeAll(al2);

		// System.out.println(al.contains(109));
		// System.out.println(al.containsAll(al2));
		// Converting AL to Arrays

		/*
		 * Object[] intArr = al.toArray();
		 * 
		 * //Integer[] ar = (Integer[]) intArr;
		 * 
		 * for (int i = 0; i < intArr.length; i++) { int o = (int) intArr[i];
		 * System.out.println(o); }
		 * 
		 * 
		 * List<Object> ll = Arrays.asList(intArr);
		 * 
		 * for(Object o : ll) { System.out.println(o); }
		 */

		/*
		 * al.add("Perla"); al.add("Siri"); al.add("Dhatrika");
		 */

		// System.out.println(al.contains(100));//checking whether the element is
		// available or not

		// System.out.println(al.indexOf(102)); //Finding option of the element

		/*
		 * System.out.println("======using normal for loop======"); for (int i = 0; i <
		 * al.size(); i++) { System.out.println(al.get(i)); }
		 * System.out.println("======using normal for loop======");
		 * 
		 * System.out.println("======using for-each loop======");
		 * 
		 * for (Object object : al) { System.out.println(object); }
		 * System.out.println("======using for-each loop======");
		 */

		// System.out.println(al.isEmpty());

		// al.remove(2);

		/*
		 * Iterator<Integer> itr = al.iterator(); while (itr.hasNext()) { // String s =
		 * (String) itr.next(); //al.remove(2); System.out.println(itr.next()); }
		 */
		/*
		 * System.out.println("forward direction"); ListIterator<Integer> itr =
		 * al.listIterator();
		 * 
		 * while(itr.hasNext()){ System.out.println(itr.next()); }
		 * 
		 * 
		 * System.out.println("Backward direction"); while(itr.hasPrevious()){
		 * System.out.println(itr.previous()); }
		 */

	}
}
