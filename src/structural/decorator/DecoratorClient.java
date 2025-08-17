package structural.decorator;

import structural.decorator.IceCream;
import structural.decorator.cones.ChocolateCone;
import structural.decorator.cones.SimpleCone;
import structural.decorator.syrups.BlackCurrentSyrup;
import structural.decorator.syrups.ChocoletSyrup;
import structural.decorator.toppings.Chocklet;
import structural.decorator.toppings.Vanilla;

public class DecoratorClient {
    public static void main(String[] args) {
        IceCream iceCream = new Vanilla(new Chocklet(new ChocoletSyrup(new SimpleCone(new BlackCurrentSyrup(new ChocolateCone())))));
        System.out.println(iceCream.getDescription());
        System.out.println("Total Cost: " + iceCream.getCost());

        System.out.println(iceCream);
    }
}
