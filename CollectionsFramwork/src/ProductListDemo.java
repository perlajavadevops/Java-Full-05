import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductListDemo {

	public List<Product> getList(){
		Product product1 = new Product("3 Star", "MultiColour", 900.00, "Good");
		Product product2 = new Product("2 Star", "SingleColour", 400.00, "Average");
		Product product3 = new Product("5 Star", "GreenColour", 200.00, "Excellent");
		Product product4 = new Product("4 Star", "WhiteColour", 300.00, "Very Good");
		
		List<Product> list= new ArrayList<Product>();
		Collections.synchronizedList(list);
		list.add(product4);
		list.add(product3);
		list.add(product2);
		list.add(product1);
		
		return list;
	}
}
