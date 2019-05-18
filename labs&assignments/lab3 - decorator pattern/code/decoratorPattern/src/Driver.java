public class Driver {
    public static void main(String args[]){
        Pizza pizza = new MarinatedBeef(new RomaTomatoes(new BagelPizza()));
        System.out.println(String.format("Description: %s\nCost: %f", pizza.getDescription(), pizza.getCost()));
    }
}
