package creation.factorymethodpattern;

import creation.factorymethodpattern.creator.BlackShipFactory;
import creation.factorymethodpattern.creator.ShipFactory;
import creation.factorymethodpattern.creator.WhiteShipFactory;

public class Client {
    private void print(ShipFactory factory, String name) {
        System.out.println(factory.orderShip(name));
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.print(new WhiteShipFactory(), "White Ship");
        c.print(new BlackShipFactory(), "Black Ship");
    }
}
