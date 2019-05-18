public class BrickHouse extends House {
    public BrickHouse(boolean customerWantsInsulation) {
        super(customerWantsInsulation);
    }

    @Override
    public void getWalls() {
        System.out.println("Getting walls with brick base...");
    }

    @Override
    public void getInsulation() {
        System.out.println("Getting insulated panels...");
    }


}
