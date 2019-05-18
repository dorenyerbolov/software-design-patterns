public class Waiter {
    private Order order;

    public void setOrder(Order newOrder){
        order = newOrder;
    }

    public void placeOrder(){
        order.execute();
    }
}
// It is an equivalent to Invoker class. The waiter is gonna take order from a customer(client) and place it to the chef(receiver).
