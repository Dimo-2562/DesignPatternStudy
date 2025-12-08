package creation.abstractfactorypattern.product.checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacCheckbox.");
    }
}
