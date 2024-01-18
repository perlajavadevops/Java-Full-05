public class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	private float salary;
	private String empNumber;

	public Employee(int empId, String name, float salary, String empNumber) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.empNumber = empNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((empNumber == null) ? 0 : empNumber.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;

		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (empNumber == null) {
			if (other.empNumber != null)
				return false;
		} else if (!empNumber.equals(other.empNumber))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
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

	@Override
	public int compareTo(Employee o) {
		// return name.compareTo(o.getName());

		if (salary > o.getSalary()) {
			return 1;
		} else if (salary < o.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}

}
