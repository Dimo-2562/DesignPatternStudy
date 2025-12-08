package creation.abstractfactorypattern;

import creation.abstractfactorypattern.factory.GUIFactory;
import creation.abstractfactorypattern.factory.MacFactory;
import creation.abstractfactorypattern.factory.WinFactory;
import creation.abstractfactorypattern.product.button.Button;
import creation.abstractfactorypattern.product.checkbox.Checkbox;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== Mac GUI ===");
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();

        System.out.println("\n=== Windows GUI ===");
        GUIFactory winFactory = new WinFactory();
        Application winApp = new Application(winFactory);
        winApp.paint();

        System.out.println("\n=== Dynamic Creation Demo ===");
        macApp.replaceButton();
        macApp.paint();

        System.out.println("\n=== Creating New Components ===");
        Button newButton = macApp.createNewButton();
        Checkbox newCheckbox = macApp.createNewCheckbox();
        newButton.paint();
        newCheckbox.paint();
    }
}
