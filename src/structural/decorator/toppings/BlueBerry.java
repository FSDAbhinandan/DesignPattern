package structural.decorator.toppings;

import structural.decorator.IceCream;

public class BlueBerry implements IceCream {
    IceCream iceCream;
    public BlueBerry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+"blueberry ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 15; // Cost of blueberry topping
    }

    @Override
    public String toString() {
        return "BlueBerry{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
