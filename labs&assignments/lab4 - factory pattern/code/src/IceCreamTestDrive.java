public class IceCreamTestDrive {
    public static void main(String args[]) {
        IceCreamStore ics = new ArizonaIceCreamStore();
        IceCream ic = ics.orderIceCream("rocky");

        IceCreamStore ics2 = new ChicagoIceCreamStore();
        IceCream ic2 = ics.orderIceCream("cherry");
    }
}
