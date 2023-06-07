import java.util.ArrayList;
import java.util.List;

public class Order {
    public double totalPrice = 0;
    public int count = 0;
    public double shippingCost = 10;
    public boolean discountAdded = false;
    public int id;

    public List<OrderObserver> observers = new ArrayList<OrderObserver>();

    public Order(int id) {
    }

    public void attach(OrderObserver observer) {
    }

    public void detach(OrderObserver observer) {
    }

    public double getTotalPrice() {
    }

    public int getCount() {
    }

    public void addItem(double price) {
    }

    public void removeItem(double price) {
    }

    @Override
    public String toString() {
    }
}