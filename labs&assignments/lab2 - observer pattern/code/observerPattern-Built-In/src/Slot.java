import java.util.Observable;

public class Slot extends Observable {
    private String author;
    private double price;
    private String name;

    public Slot() {
    }

    public void measurementsChanges() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(String author, double price, String name) {
        this.author = author;
        this.price = price;
        this.name = name;
        measurementsChanges();
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
