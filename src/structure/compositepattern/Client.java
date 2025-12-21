package structure.compositepattern;

import structure.compositepattern.composite.Box;
import structure.compositepattern.composite.Product;

public class Client {
    public static void main(String[] args) {
        Box box = new Box("Main Box");
        Product armor = new Product("Armor", 250);
        Product sword = new Product("Sword", 150);

        box.add(armor);
        box.add(sword);

        Box subBox = new Box("Sub Box");
        Product apple = new Product("Apple", 150);
        Product banana = new Product("Banana", 250);

        subBox.add(apple);
        subBox.add(banana);

        box.add(subBox);

        System.out.printf("total price of %s: %d\n", box.getName(), box.getPrice());
        System.out.printf("total price of %s: %d\n", subBox.getName(), subBox.getPrice());
    }
}
