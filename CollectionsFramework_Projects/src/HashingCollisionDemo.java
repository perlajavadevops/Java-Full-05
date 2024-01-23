import java.util.HashMap;
import java.util.Objects;

class Customer {

	private int customerId;
	private String name;

	public Customer(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; Customer other = (Customer) obj; return
		 * customerId == other.customerId && Objects.equals(name, other.name);
		 */
		
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}

}

public class HashingCollisionDemo {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "perlareddy");
		Customer customer2 = new Customer(2, "perlareddy");
		System.out.println(customer1.hashCode());
		System.out.println(customer2.hashCode());
		HashMap<Customer, Integer> map = new HashMap<Customer, Integer>();
		map.put(customer1, 1);
		map.put(customer2, 2);
		System.out.println(map);
	}
}
