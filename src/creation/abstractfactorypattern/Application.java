package creation.abstractfactorypattern;

import creation.abstractfactorypattern.factory.GUIFactory;
import creation.abstractfactorypattern.product.button.Button;
import creation.abstractfactorypattern.product.checkbox.Checkbox;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public void replaceButton() {
        System.out.println("Replacing button...");
        this.button = factory.createButton();
    }

    public void replaceCheckbox() {
        System.out.println("Replacing checkbox...");
        this.checkbox = factory.createCheckbox();
    }

    public Button createNewButton() {
        return factory.createButton();
    }

    public Checkbox createNewCheckbox() {
        return factory.createCheckbox();
    }
}
