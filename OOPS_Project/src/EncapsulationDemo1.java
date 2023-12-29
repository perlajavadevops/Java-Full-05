public class EncapsulationDemo1 {

    public static void main(String[] args) {
        Order order = new Order();

        System.out.println(order.getOrderId());
        System.out.println(order.getFeatures());
        System.out.println(order.getPrice());
        System.out.println(order.getProductName());
        System.out.println(order.isProductWork());
    }
}
