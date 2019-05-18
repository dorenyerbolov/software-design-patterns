public class WhiteGoatCheese extends ToppingDecorator {
    public WhiteGoatCheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {
        return pizza.getCost() + 0.50d;
    }
}
