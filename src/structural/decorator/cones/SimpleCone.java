package structural.decorator.cones;

import structural.decorator.IceCream;

public class SimpleCone implements IceCream {

    IceCream iceCream;

    public SimpleCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public SimpleCone() {
        // Default constructor for a plain cone without ice cream
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + " in a cone";
        }
        return "Cone ";
    }

    @Override
    public double getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 1.0; // Cost of the cone added to the ice cream cost
        }
        return 1.0; // Base cost of the cone
    }

    @Override
    public String toString() {
        return "Cone{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
