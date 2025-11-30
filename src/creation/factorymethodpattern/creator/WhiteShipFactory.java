package creation.factorymethodpattern.creator;

import creation.factorymethodpattern.product.Ship;
import creation.factorymethodpattern.product.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
