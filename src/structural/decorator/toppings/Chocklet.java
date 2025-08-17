package structural.decorator.toppings;

import structural.decorator.IceCream;

public class Chocklet implements IceCream {
    IceCream iceCream;
    public Chocklet(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "chocklet ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 20; // Cost of chocklet topping
    }

    @Override
    public String toString() {
        return "Chocklet{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
