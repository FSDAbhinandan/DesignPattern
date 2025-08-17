package structural.decorator.syrups;

import structural.decorator.IceCream;

public class BlackCurrentSyrup implements IceCream {
    IceCream iceCream;
    public BlackCurrentSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "black current syrup ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost()+ 20; // Cost of black current syrup
    }

    @Override
    public String toString() {
        return "BlackCurrentSyrup{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
