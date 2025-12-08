package creation.abstractfactorypattern.product.checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WinCheckbox.");
    }
}
