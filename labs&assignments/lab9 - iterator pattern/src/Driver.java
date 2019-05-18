import java.util.ArrayList;
import java.util.HashMap;

public class Driver {
    public static void main(String args[]) {
        TechStore techStore = new TechStore();
        techStore.addItem("Tech Product 1", "desc about tech product 1", 150);
        techStore.addItem("Tech Product 2", "desc about tech product 2", 250);
        techStore.addItem("Tech Product 3", "desc about tech product 3", 350);

        GroceryStore groceryStore = new GroceryStore();
        groceryStore.addItem("Grocery Product 1", "desc about grocery product 1", 150);
        groceryStore.addItem("Grocery Product 2", "desc about grocery product 2", 250);
        groceryStore.addItem("Grocery Product 3", "desc about grocery product 3", 350);

        ShoeStore shoeStore = new ShoeStore();
        shoeStore.addItem("Shoe Product 1", "desc about shoe grocery product 1", 150);
        shoeStore.addItem("Shoe Product 2", "desc about shoe grocery product 2", 250);
        shoeStore.addItem("Shoe Product 3", "desc about shoe grocery product 3", 350);

        Salesman salesman = new Salesman(techStore, groceryStore, shoeStore);
        salesman.printItems();
    }
}
