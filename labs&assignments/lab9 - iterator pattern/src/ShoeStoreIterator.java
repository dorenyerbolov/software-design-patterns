import java.util.ArrayList;

public class ShoeStoreIterator implements Iterator {
    private ArrayList<StoreItem> items;
    private int cursor;

    public ShoeStoreIterator(ArrayList<StoreItem> items) {
        this.items = items;
        cursor = 0;
    }

    @Override
    public Object next() {
        return items.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor < items.size();
    }

}
