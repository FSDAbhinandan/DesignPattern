package structural.decorator.syrups;

import structural.decorator.IceCream;

public class ChocoletSyrup implements IceCream {
    IceCream iceCream;
    public ChocoletSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "chocolet syrup ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 15; // Cost of chocolet syrup
    }

    @Override
    public String toString() {
        return "ChocoletSyrup{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
