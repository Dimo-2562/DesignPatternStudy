package creation.factorymethodpattern;

import creation.factorymethodpattern.creator.BlackShipFactory;
import creation.factorymethodpattern.creator.WhiteShipFactory;
import creation.factorymethodpattern.product.Ship;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("whiteShip");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("blackShip");
        System.out.println(blackship);
    }
}
