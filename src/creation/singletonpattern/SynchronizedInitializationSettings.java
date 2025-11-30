package creation.singletonpattern;

public class SynchronizedInitializationSettings {

    private static SynchronizedInitializationSettings instance;

    private SynchronizedInitializationSettings() {}

    public static synchronized SynchronizedInitializationSettings getInstance() {
        if (instance == null) {
            instance = new SynchronizedInitializationSettings();
        }

        return instance;
    }
}
