import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(true);
		al.add("Dhatrika");
		al.add(70.90);
		
		al.add(0, "Siri");
		
		//System.out.println(al);
		
		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.println(al.get(i)); }
		 * System.out.println("=============="); for(Object obj : al) {
		 * System.out.println(obj); }
		 */
		System.out.println("=================");
		/*
		 * Iterator itr = al.iterator(); while(itr.hasNext()) {
		 * 
		 * System.out.println(itr.next()); itr.remove(); }
		 */
		
		System.out.println("==========================");
		ListIterator listItr = al.listIterator();
		while(listItr.hasNext()) {
			
			System.out.println(listItr.next());
		}
		System.out.println("===========");
		while(listItr.hasPrevious()) {
			
			System.out.println((String)listItr.previous());
		}

		
//		/System.out.println(al.size());
		
		
	}

}
