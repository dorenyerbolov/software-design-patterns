public abstract class House {
    private boolean customerWantsInsulation;

    public House(boolean customerWantsInsulation) {
        this.customerWantsInsulation = customerWantsInsulation;
    }

    public void getFoundation() {
        System.out.println("Getting the foundation of the house done...");
    }

    public void getCommunication() {
        System.out.println("Getting the communication needs, such as: water, heat, gas and air conditioning...");
    }

    public abstract void getWalls();

    public abstract void getInsulation();

    public final void getHouse() {
        getFoundation();
        getWalls();
        getCommunication();
        if (customerWantsInsulation) {
            getInsulation();
        }
    }

}
