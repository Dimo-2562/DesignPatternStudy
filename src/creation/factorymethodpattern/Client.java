package creation.factorymethodpattern;

import creation.factorymethodpattern.creator.EnumShipFactory;

public class Client {
    private void print(EnumShipFactory enumShipFactory, String name) {
        System.out.println(enumShipFactory.orderShip(name));
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.print(EnumShipFactory.WHITESHIPFACTORY, "White Ship");
        c.print(EnumShipFactory.BLACKSHIPFACTORY, "Black Ship");
    }
}
