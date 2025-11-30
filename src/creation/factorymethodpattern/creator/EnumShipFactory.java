package creation.factorymethodpattern.creator;

import creation.factorymethodpattern.product.BlackShip;
import creation.factorymethodpattern.product.Ship;
import creation.factorymethodpattern.product.WhiteShip;

public enum EnumShipFactory {
    WHITESHIPFACTORY {
        @Override
        public Ship createShip(String name) {
            return new WhiteShip(name);
        }
    },
    BLACKSHIPFACTORY {
        @Override
        public Ship createShip(String name) {
            return new BlackShip(name);
        }
    };

    protected abstract Ship createShip(String name);

    public Ship orderShip(String name) {
        validate(name);
        prepareFor(name);
        return createShip(name);
    }

    private void validate(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException();
    }

    private void prepareFor(String name) {
        System.out.println("Preparing for " + name);
    }
}
