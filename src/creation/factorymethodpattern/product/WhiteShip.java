package creation.factorymethodpattern.product;

public class WhiteShip extends ConcreteShip{
    public WhiteShip(String name) {
        setName(name);
        setColor("white");
    }
}
