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
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCount() {
        return count;
    }

    public void addItem(double price) {
        this.totalPrice += price;
        this.count ++;
        observers.forEach(observer -> observer.update(this));
    }

    public void removeItem(double price) {
        this.totalPrice -= price;
        this.count --;
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public String toString() {
        return "Order{" +
                "totalPrice=" + totalPrice +
                ", count=" + count +
                ", shippingCost=" + shippingCost +
                '}';
    }
}