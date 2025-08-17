package structural.decorator.cones;

import structural.decorator.IceCream;

public class ChocolateCone implements IceCream {

    @Override
    public String getDescription() {
        return "Chocolate Cone ";
    }

    @Override
    public double getCost() {
        return 50; // Base cost of chocolate cone
    }

    @Override
    public String toString() {
        return "ChocolateCone{" +
                "description='" + getDescription() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
