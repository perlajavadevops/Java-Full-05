import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionAddAllDemo {

	public static void main(String[] args) {
		
		//ArrayList<String> al1 = new ArrayList<String>();
		CopyOnWriteArrayList<String> al1 = new CopyOnWriteArrayList<String>();
		al1.add("Deva");
		al1.add("Madhu");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Rajitha");
		al2.add("Siri");
		al2.add("Deva");
		
		//al2.remove("Deva");
		
		//al1.addAll(al2);
		
		
		//al1.removeAll(al2);
		
		//System.out.println(al1.containsAll(al2));
		//al1.con
		//al1.retainAll(al2);
		
		for(String s : al1) {
			al1.add("Perla");
			System.out.println(s);
		}
	}
}
