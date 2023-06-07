public class QuantityObserver implements OrderObserver {
    public void update(Order order) {
        int count = order.getCount();
        if (count > 5) {
            order.shippingCost = 0;
        }
        else {
            order.shippingCost = 10;
        }
    }
}