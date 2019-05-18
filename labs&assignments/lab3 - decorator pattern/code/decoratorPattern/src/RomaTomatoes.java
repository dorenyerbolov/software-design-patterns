public class RomaTomatoes extends ToppingDecorator {
    public RomaTomatoes(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Roma Tomatoes";
    }

    public double getCost() {
        return pizza.getCost() + 0.25d;
    }
}
