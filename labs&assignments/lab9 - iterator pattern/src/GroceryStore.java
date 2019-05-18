public class GroceryStore {
    private static final int MAX_ITEMS = 5;
    private int currentNumberOfItems = 0;
    private StoreItem[] items;

    public GroceryStore() {
        items = new StoreItem[MAX_ITEMS];
    }

    public void addItem(String name, String description, double price) {
        StoreItem item = new StoreItem(name, description, price);

        if (currentNumberOfItems >= MAX_ITEMS) {
            System.out.println("Unable to add. Store is full!");
        } else {
            items[currentNumberOfItems++] = item;
        }
    }

    public Iterator createIterator() {
        return new GroceryStoreIterator(items);
    }
}
