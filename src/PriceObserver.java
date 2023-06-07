public class PriceObserver implements OrderObserver {

    public void update(Order order) {
        if (order.getTotalPrice() > 200 && !order.discountAdded) {
            order.totalPrice = order.getTotalPrice() - 20;
            order.discountAdded = true ;
        }
        if (order.getTotalPrice() < 200 && order.discountAdded){
            order.totalPrice = order.getTotalPrice() + 20;
            order.discountAdded = false ;
        }
    }
}