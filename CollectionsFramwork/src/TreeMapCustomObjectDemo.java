import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapCustomObjectDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",907070707070L,7000.5f);
		Employee emp3 = new Employee(103,"Karma",707090707070L,4300.5f);
		Employee emp4 = new Employee(100,"Teja",607090707070L,2300.5f);
		Employee emp5 = new Employee(100,"Confience",607090707070L,2300.5f);

		TreeMap<Employee,String>  map = new TreeMap<Employee,String>();
		
	//	TreeMap<String, String>  map = new TreeMap<String, String>();
		//LinkedHashMap<String, String>  map = new LinkedHashMap<String, String>();
		/*map.put("One", "Karma");
		map.put("Two", "Reddy");
		map.put("Four", "Dhatrika");
		map.put("TwoT", "Siva");
		map.put("TwoQ", "Teja");
		*/
		
		map.put(emp1,"One");
		map.put(emp2,"Two");
		map.put(emp4,"Four");
	/*	map.put("One", emp1);
		map.put("Two", emp2);
		map.put("Four", emp4);
		map.put("Four", emp5);
		map.put("TwoT", emp3);
		map.put("Three", emp3);//101
		map.put("Three", emp4);*///101

		//System.out.println(map);

		System.out.println("Using Iterator ");
		Set<Entry<Employee,String>> set = map.entrySet();//it will convert map to Set

		Iterator<Entry<Employee,String>> itr = set.iterator();
		while(itr.hasNext()){
			Entry<Employee,String> entries = itr.next();
			System.out.print(entries.getKey()+" : ");
			System.out.println(entries.getValue().toString());
			//entries.getValue().displayEmplyee();
		}
	}
}
