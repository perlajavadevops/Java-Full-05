import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
		Employee emp2 = new Employee(102,"Dhatrika",707070707070L,2000.5f);
		Employee emp3 = new Employee(103,"Abhi",707070707070L,4000.5f);
		Employee emp4 = new Employee(103,"Abhi",707070707070L,4000.5f);

		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());

		//TreeSet<Employee> set1 = new TreeSet<Employee>();
		HashSet<Employee> set1 = new HashSet<Employee>();

		set1.add(emp2);
		set1.add(emp1);
		set1.add(emp3);
		set1.add(emp4);
		
		Iterator<Employee> itr = set1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			//Employee e = itr.next();
			//e.displayEmplyee();
			//itr.next().displayEmplyee();
		}
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Reddy");
		set.add("Mahesh");
		set.add("Karthik");
		set.add("Dhatrika");//entry <k,v>
		set.add("Dhatrika");
		//set.add(null);
		
		/*
		 * Iterator<String> itr = set.iterator(); while(itr.hasNext()){
		 * System.out.println(itr.next()); //Employee e = itr.next();
		 * //e.displayEmplyee(); //itr.next().displayEmplyee(); }
		 */
	}
}
