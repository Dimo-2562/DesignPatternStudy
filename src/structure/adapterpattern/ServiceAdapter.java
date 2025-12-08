package structure.adapterpattern;

public class ServiceAdapter implements Target{
    private ExistingService adaptee;

    public ServiceAdapter(ExistingService adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method(int data) {
        adaptee.specificMethod(data);
    }
}
