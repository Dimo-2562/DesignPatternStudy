package creation.singletonpattern;

public class LazyInitializationSettings {

    private static LazyInitializationSettings instance;

    private LazyInitializationSettings() {}

    public static LazyInitializationSettings getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSettings();
        }

        return instance;
    }
}
