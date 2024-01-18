

public class Product {

	//POJO
	private String customerReview;
	private String newArraivals;
	private double price;
	private String features;

	public Product(String customerReview, String newArraivals, double price,
			String features) {
		this.customerReview = customerReview;
		this.newArraivals = newArraivals;
		this.price = price;
		this.features = features;
	}

	public String getCustomerReview() {
		return customerReview;
	}

	public void setCustomerReview(String customerReview) {
		this.customerReview = customerReview;
	}

	public String getNewArraivals() {
		return newArraivals;
	}

	public void setNewArraivals(String newArraivals) {
		this.newArraivals = newArraivals;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Product [customerReview=" + customerReview + ", newArraivals="
				+ newArraivals + ", price=" + price + ", features=" + features
				+ "]";
	}

}
