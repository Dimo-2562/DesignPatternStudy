package structure.adapterpattern;

public class Client {
    public static void main(String[] args) {
        Target adapter = new ServiceAdapter(new ExistingService());
        adapter.method(1);
    }
}
