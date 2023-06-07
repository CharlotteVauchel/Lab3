public class Client {
    public Order[] orders;

    public Client(int nbOrders){
        orders = new Order[nbOrders];
    }

    public void addOrder(int numOrder){
        orders[numOrder] = new Order(numOrder);
        orders[numOrder].attach(new PriceObserver());
        orders[numOrder].attach(new QuantityObserver());
    }

}