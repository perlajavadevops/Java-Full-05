public class EncapsulationDemo {
    public static void main(String[] args) {

        Order order = new Order();
        order.setProductWork(true);
        order.setFeatures("Good");
        order.setOrderId(101111);
        order.setProductName("Watch");
        order.setPrice(3000.89);

        System.out.println(order.getOrderId());
        System.out.println(order.getFeatures());
        System.out.println(order.getPrice());
        System.out.println(order.getProductName());
        System.out.println(order.isProductWork());
    }
}
