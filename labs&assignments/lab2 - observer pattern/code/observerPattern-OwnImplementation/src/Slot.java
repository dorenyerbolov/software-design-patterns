import java.util.ArrayList;

public class Slot implements Subject {
    private String author;
    private double price;
    private String name;
    private ArrayList observers;

    public Slot() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    public void removeObserver(Observer ob) {
        int index = observers.indexOf(ob);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer ob = (Observer) observers.get(i);
            ob.update(author, price, name);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(String author, double price, String name) {
        this.author = author;
        this.price = price;
        this.name = name;
        measurementsChanged();
    }
}
