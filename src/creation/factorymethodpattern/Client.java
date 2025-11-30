package creation.factorymethodpattern;

import creation.factorymethodpattern.creator.ShipFactory;
import creation.factorymethodpattern.product.Ship;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("whiteship");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("blackship");
        System.out.println(blackship);
    }
}
