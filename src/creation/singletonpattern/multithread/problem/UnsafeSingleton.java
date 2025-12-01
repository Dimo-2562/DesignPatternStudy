package creation.singletonpattern.multithread.problem;

public class UnsafeSingleton {

    private static final UnsafeSingleton INSTANCE = new UnsafeSingleton();

    private int counter = 0;

    private UnsafeSingleton() {}

    public static UnsafeSingleton getInstance() {
        return INSTANCE;
    }

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void resetCounter() {
        counter = 0;
    }


}
