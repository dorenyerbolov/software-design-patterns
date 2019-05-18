import java.util.ArrayList;

public abstract class IceCream {
    protected String name;
    protected String chocolateType;
    protected ArrayList decorations = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Blending...");
        System.out.println("Tossing " + chocolateType);
        System.out.println("Freezing...");
        System.out.println("Adding decorations: ");
        for (int i = 0; i < decorations.size(); i++) {
            System.out.println(" " + decorations.get(i));
        }

    }

    public void pack() {
        System.out.println("Place IceCream in official IceCreamStore cup");
    }

    public String getName() {
        return name;
    }
}
