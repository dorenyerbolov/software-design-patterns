import java.util.ArrayList;

public class TechStore {
    private ArrayList<StoreItem> items;

    public TechStore() {
        items = new ArrayList<>();
    }

    public void addItem(String name, String description, double price) {
        StoreItem item = new StoreItem(name, description, price);
        items.add(item);
    }

    public Iterator createIterator() {
        return new TechStoreIterator(items);
    }
}
