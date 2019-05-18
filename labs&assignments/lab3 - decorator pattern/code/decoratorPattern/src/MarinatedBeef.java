public class MarinatedBeef extends ToppingDecorator {
    public MarinatedBeef(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Marinated Beef";
    }

    public double getCost() {
        return pizza.getCost() + 0.80d;
    }
}
