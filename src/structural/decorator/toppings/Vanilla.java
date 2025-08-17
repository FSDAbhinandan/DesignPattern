package structural.decorator.toppings;

import structural.decorator.IceCream;

public class Vanilla implements IceCream {

    IceCream iceCream;

    public Vanilla(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+"vanilla ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String toString() {
        return "vanilla{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
