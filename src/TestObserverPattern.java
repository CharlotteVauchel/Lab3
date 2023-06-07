public class TestObserverPattern {

    public static void main(String[] args) {
        Client client = new Client(5);
        client.addOrder(0);
        client.addOrder(1);
        client.addOrder(2);

        //Test on the item discount
        client.orders[0].addItem(100);
        client.orders[0].addItem(200);
        System.out.println(client.orders[0].toString());

        //Test on the item count
        client.orders[1].addItem(10);
        client.orders[1].addItem(10);
        client.orders[1].addItem(10);
        client.orders[1].addItem(10);
        client.orders[1].addItem(10);
        client.orders[1].addItem(10);
        System.out.println(client.orders[1].toString());

        //Test on remove (not supposed to have the discount and have the shipping costs)
        client.orders[2].addItem(50);
        client.orders[2].addItem(50);
        client.orders[2].removeItem(50);
        client.orders[2].addItem(50);
        client.orders[2].addItem(50);
        System.out.println(client.orders[2].toString());
    }
}
