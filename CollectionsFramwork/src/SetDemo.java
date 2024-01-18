import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;


public class SetDemo {

		public static void main(String[] args) {
			Employee emp1 = new Employee(101,"Reddy",8080808080L,3030.00F);
			Employee emp2 = new Employee(102,"Dhatrika",707070707070L,2000.5f);
			Employee emp3 = new Employee(103,"Abhi",707070707070L,4000.5f);

			HashSet<Employee> al = new HashSet<Employee>(); 
			al.add(emp2);
			al.add(emp1);
			al.add(emp3);
			List list = new ArrayList(al);
			list.sort(new EmployeeNameComparator());
			System.out.println("Sorting based on name ");
			Iterator<Employee> itr1 = list.iterator();
			while(itr1.hasNext()){
				//System.out.println(itr.next());
				Employee employee = itr1.next();
				employee.displayEmplyee();
			}
			list.sort(new SalaryComparator());

			//HashSet<String> al = new HashSet<String>(); 
			//LinkedHashSet<String> al = new TreeSet<String>(); 
			//al.add("121");
			/*al.add("Lama");
			al.add("Perla");
			al.add("Siri");
			al.add("Dhatrika");*/
			
			
			
			/*System.out.println("using for-each loop ");
			
			for (Employee val : al) {
				val.displayEmplyee();
			}*/
			
			System.out.println("Sorting based on Salary ");
			Iterator<Employee> itr = list.iterator();
			while(itr.hasNext()){
				//System.out.println(itr.next());
				Employee employee = itr.next();
				employee.displayEmplyee();
			}
		}
}
