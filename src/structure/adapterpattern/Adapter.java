package structure.adapterpattern;

public class Adapter implements Target{
    Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method(int data) {
        adaptee.specificMethod(data);
    }
}
