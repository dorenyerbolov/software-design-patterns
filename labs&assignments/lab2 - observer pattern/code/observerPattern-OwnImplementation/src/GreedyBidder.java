public class GreedyBidder implements Observer {
    private String bidAuthor;
    private double bidPrice;
    private String bidName;
    private Subject slot;

    public GreedyBidder(Subject slot) {
        this.slot = slot;
        slot.registerObserver(this);
    }

    public void update(String author, double price, String name) {
        bidAuthor = author;
        bidPrice = price;
        bidName = name;
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%s", bidAuthor, bidPrice, bidName);
    }
}
