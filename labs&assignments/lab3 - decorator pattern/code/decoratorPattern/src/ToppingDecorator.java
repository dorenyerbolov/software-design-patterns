public abstract class ToppingDecorator extends Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    public abstract String getDescription();

    public abstract double getCost();
}
