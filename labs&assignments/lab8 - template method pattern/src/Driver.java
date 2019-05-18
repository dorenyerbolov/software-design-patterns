public class Driver {
    public static void main(String args[]) {
        WoodenHouse woodenHouse = new WoodenHouse(false);
        BrickHouse brickHouse = new BrickHouse(true);

        System.out.println("Building wooden house...");
        woodenHouse.getHouse();

        System.out.println("\nBuilding brick house...");
        brickHouse.getHouse();
    }
}
