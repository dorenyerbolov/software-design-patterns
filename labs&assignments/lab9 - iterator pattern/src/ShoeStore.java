import java.util.ArrayList;
import java.util.HashMap;

public class ShoeStore {
    private HashMap<String, StoreItem> items;

    public ShoeStore() {
        items = new HashMap<>();
    }

    public void addItem(String name, String description, double price) {
        StoreItem item = new StoreItem(name, description, price);
        items.put(item.getName(), item);
    }

    public Iterator createIterator() {
        ArrayList<StoreItem> tmp = new ArrayList<>(items.values());
        return new ShoeStoreIterator(tmp);
    }

}
