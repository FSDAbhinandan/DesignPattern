package structural.decorator.toppings;

import structural.decorator.IceCream;

public class BlackCurrent implements IceCream {
    IceCream iceCream;
    public BlackCurrent(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() +"black current ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 25; // Cost of black current topping
    }

    @Override
    public String toString() {
        return "BlackCurrent{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
