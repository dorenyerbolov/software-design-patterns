import java.util.Observable;
import java.util.Observer;

public class GreedyBidder implements Observer {
    Observable observable;
    private String author;
    private double price;
    private String name;

    public GreedyBidder(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof Slot) {
            Slot slot = (Slot) observable;
            this.author = slot.getAuthor();
            this.price = slot.getPrice();
            this.name = slot.getName();
        }
    }

    @Override
    public String toString() {
        return String.format("%s--%s--%s", author, price, name);
    }
}
