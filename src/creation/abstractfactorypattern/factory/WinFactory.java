package creation.abstractfactorypattern.factory;

import creation.abstractfactorypattern.product.button.Button;
import creation.abstractfactorypattern.product.button.WinButton;
import creation.abstractfactorypattern.product.checkbox.Checkbox;
import creation.abstractfactorypattern.product.checkbox.WinCheckbox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
