
public class Employee {

	int empNo;
	String name;

	public Employee(Employee e) {
		System.out.println(this);
		System.out.println(e.name);
		System.out.println(e.empNo);
	}
	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int empNo) {
		this.empNo = empNo;
	}

	public void displayEmployee() {
		
		System.out.println(name);
		System.out.println(empNo);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(101);
		Employee emp2 = new Employee("Reddy");
		System.out.println(emp1);
		Employee emp3 = new Employee(emp1);
		System.out.println(emp3);
		//emp1.displayEmployee();
		
	}
	
}
