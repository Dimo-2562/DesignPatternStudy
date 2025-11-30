package creation.factorymethodpattern.creator;

import creation.factorymethodpattern.product.Ship;

public interface ShipFactory {
    default Ship orderShip(String name) {
        validate(name);
        prepareFor(name);
        return createShip();
    }

    Ship createShip();

    private void validate(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException();
    }

    private static void prepareFor(String name) {
        System.out.println("Preparing for " + name);
    }
}
