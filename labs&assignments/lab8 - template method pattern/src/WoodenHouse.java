public class WoodenHouse extends House {
    public WoodenHouse(boolean customerWantsInsulation) {
        super(customerWantsInsulation);
    }

    @Override
    public void getWalls() {
        System.out.println("Getting walls with wood base...");
    }

    @Override
    public void getInsulation() {
        System.out.println("Getting fiberglass insulation...");
    }
}
