public class Salesman {
    private TechStore techStore;
    private GroceryStore groceryStore;
    private ShoeStore shoeStore;

    public Salesman(TechStore techStore, GroceryStore groceryStore, ShoeStore shoeStore) {
        this.techStore = techStore;
        this.groceryStore = groceryStore;
        this.shoeStore = shoeStore;
    }

    public void printItems() {
        Iterator techStoreIterator = techStore.createIterator();
        Iterator groceryStoreIterator = groceryStore.createIterator();
        Iterator shoeStoreIterator = shoeStore.createIterator();
        System.out.println("---PRINTING TECH STORE ITEMS---");
        printItems(techStoreIterator);
        System.out.println("---PRINTING GROCERY STORE ITEMS---");
        printItems(groceryStoreIterator);
        System.out.println("---PRINTING SHOE STORE ITEMS---");
        printItems(shoeStoreIterator);
    }

    private void printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            StoreItem item = (StoreItem) iterator.next();
            System.out.println(String.format("Name: %s\nDescription: %s\nPrice: %f\n", item.getName(), item.getDescription(), item.getPrice()));
        }
    }
}
