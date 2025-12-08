package creation.abstractfactorypattern.factory;

import creation.abstractfactorypattern.product.button.Button;
import creation.abstractfactorypattern.product.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
