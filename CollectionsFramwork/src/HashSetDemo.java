import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Perla");
		set.add("Reddy");
		set.add("Mahesh");
		set.add("Karthik");
		set.add("Dhatrika");//entry <k,v>
		set.add("Dhatrika");
		
		ArrayList<String> al = new ArrayList<String>(set);
		
		HashSet<String> set1 = new HashSet<String>(al);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
