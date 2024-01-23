import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// HashMap hm = new HashMap();
		IdentityHashMap hm = new IdentityHashMap();
		Integer i1 = 10;
		Integer i2 = 10;
		hm.put(10, "John");
		hm.put(10, "Smith");
		System.out.println(hm);// {10=Smith}
	}
}
