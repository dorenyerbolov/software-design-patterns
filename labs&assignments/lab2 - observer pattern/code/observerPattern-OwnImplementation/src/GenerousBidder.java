public class GenerousBidder implements Observer {
    private String bidAuthor;
    private double bidPrice;
    private String bidName;
    private Subject slot;

    public GenerousBidder(Subject slot) {
        this.slot = slot;
        slot.registerObserver(this);
    }

    public void update(String author, double price, String name) {
        bidAuthor = author;
        bidPrice = price;
        bidName = name;
    }
}
