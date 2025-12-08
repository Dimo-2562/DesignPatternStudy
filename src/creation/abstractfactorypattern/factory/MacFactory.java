package creation.abstractfactorypattern.factory;

import creation.abstractfactorypattern.product.button.Button;
import creation.abstractfactorypattern.product.button.MacButton;
import creation.abstractfactorypattern.product.checkbox.Checkbox;
import creation.abstractfactorypattern.product.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
