package creation.singletonpattern;

public class EagerInitializationSettings {

    private static final EagerInitializationSettings instance = new EagerInitializationSettings();

    private EagerInitializationSettings() {}

    public static EagerInitializationSettings getInstance() {
        return instance;
    }
}
