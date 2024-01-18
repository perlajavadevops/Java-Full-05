public class Employee2 {

	private int empId;
	private String name;
	private float salary;
	private String empNumber;

	public Employee2(int empId, String name, float salary, String empNumber) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.empNumber = empNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", empNumber=" + empNumber + "]";
	}

}
