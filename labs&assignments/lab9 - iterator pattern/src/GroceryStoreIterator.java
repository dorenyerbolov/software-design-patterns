public class GroceryStoreIterator implements Iterator {
    private StoreItem[] items;
    private int cursor;

    public GroceryStoreIterator(StoreItem[] items) {
        this.items = items;
        cursor = 0;
    }

    @Override
    public Object next() {
        return items[cursor++];
    }

    @Override
    public boolean hasNext() {
        return !(cursor >= items.length || items[cursor] == null);
    }
}
