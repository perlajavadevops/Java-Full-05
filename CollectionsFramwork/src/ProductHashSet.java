import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class CustomerReviewComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getCustomerReview().compareTo(o2.getCustomerReview());
	}
	
}

class NewArraivalsComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getNewArraivals().compareTo(o2.getNewArraivals());
	}
	
}

class FeaturesComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getFeatures().compareTo(o2.getFeatures());
	}
	
}

class PriceComparator implements Comparator<Product>{
//LowTOHigh
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrice()>o2.getPrice()){
			return 1;
		}else if(o1.getPrice()<o2.getPrice()){
			return -1;
		}else{
			return 0;
		}
	}
	
}

class HighToLowPriceComparator implements Comparator<Product>{
	//HighToLow
		@Override
		public int compare(Product o1, Product o2) {
			if(o2.getPrice()>o1.getPrice()){
				return 1;
			}else if(o2.getPrice()<o1.getPrice()){
				return -1;
			}else{
				return 0;
			}
		}
		
	}
public class ProductHashSet {

	public static void main(String[] args) {
		
		//Product(customerReview, newArraivals, price,features)
		Product product1 = new Product("3 Star", "MultiColour", 900.00, "Good");
		Product product2 = new Product("2 Star", "SingleColour", 400.00, "Average");
		Product product3 = new Product("5 Star", "GreenColour", 200.00, "Excellent");
		Product product4 = new Product("4 Star", "WhiteColour", 300.00, "Very Good");
		
		HashSet<Product> al = new HashSet<Product>(); 
		al.add(product1);
		al.add(product3);
		al.add(product2);
		al.add(product4);
		
		ArrayList<Product> list = new ArrayList<Product>(al);
		
		//Collections.sort(list, new CustomerReviewComparator());
		
		list.sort(new CustomerReviewComparator());
		System.out.println("==========Sorting based on Customer Reviews=========== ");
		Iterator<Product> itr1 = list.iterator();
		while(itr1.hasNext()){
			Product product = itr1.next();
			System.out.println(product.toString());
		}
		
		list.sort(new PriceComparator());
		System.out.println("=============Sorting based on Low to High Price=========== ");
		itr1 = list.iterator();
		while(itr1.hasNext()){
			Product product = itr1.next();
			System.out.println(product.toString());
		}
		
		list.sort(new FeaturesComparator());
		System.out.println("==============Sorting based on Features============= ");
		itr1 =  list.iterator();
		while(itr1.hasNext()){
			Product product = itr1.next();
			System.out.println(product.toString());
		}
		
		list.sort(new NewArraivalsComparator());
		System.out.println("==============Sorting based on New Arraivals============= ");
		itr1 =  list.iterator();
		while(itr1.hasNext()){
			Product product = itr1.next();
			System.out.println(product.toString());
		}
		
		list.sort(new HighToLowPriceComparator());
		System.out.println("==============Sorting based on HighToLowPriceComparator============= ");
		itr1 =  list.iterator();
		while(itr1.hasNext()){
			Product product = itr1.next();
			System.out.println(product.toString());
		}
	}
}
