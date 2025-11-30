package creation.factorymethodpattern.product;

public class ConcreteShip implements Ship {
    private String name;
    private String color;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ConcreteShip{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
