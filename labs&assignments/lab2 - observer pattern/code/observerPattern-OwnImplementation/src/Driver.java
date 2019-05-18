public class Driver {
    public static void main(String args[]) {
        Slot slot = new Slot();

        GreedyBidder gb = new GreedyBidder(slot);
        slot.setMeasurements("Dauren", 1000, "knife");
        System.out.println(gb);

        slot.setMeasurements("Islam", 10002, "fork");
        System.out.println(gb);
    }
}
