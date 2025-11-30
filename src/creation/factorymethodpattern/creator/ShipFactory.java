package creation.factorymethodpattern.creator;

import creation.factorymethodpattern.product.Ship;

public class ShipFactory {
    public static Ship orderShip(String name) {
        validate(name);
        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship"))
            ship.setColor("white");
        else if (name.equalsIgnoreCase("blackship"))
            ship.setColor("black");

        return ship;
    }

    private static void validate(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException();
    }

    private static void prepareFor(String name) {
        System.out.println("Preparing for " + name);
    }
}
