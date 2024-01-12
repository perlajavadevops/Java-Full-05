public class Employee2 {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 102;

	private int empNo;
	private static String name;
	private double salary;
	private transient long phoneNumber;
	
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee2(int empNo, String name, double salary, long phoneNumber) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
