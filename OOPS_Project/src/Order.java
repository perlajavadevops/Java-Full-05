public class Order {

	private int orderId;
	private String productName;
	private String features;
	private boolean productWork;
	private double price;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public boolean isProductWork() {
		return productWork;
	}

	public void setProductWork(boolean productWork) {
		this.productWork = productWork;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
