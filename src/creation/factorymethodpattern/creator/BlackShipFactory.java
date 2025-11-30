package creation.factorymethodpattern.creator;

import creation.factorymethodpattern.product.BlackShip;
import creation.factorymethodpattern.product.Ship;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}
