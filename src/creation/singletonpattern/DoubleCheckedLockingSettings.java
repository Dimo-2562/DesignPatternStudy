package creation.singletonpattern;

public class DoubleCheckedLockingSettings {

    private static volatile DoubleCheckedLockingSettings instance;

    public static DoubleCheckedLockingSettings getInstance() {
        if (instance == null) { // 락 없이 검사
            synchronized (DoubleCheckedLockingSettings.class) { // 최초 생성 시에만 진입
                if(instance == null) {
                    instance = new DoubleCheckedLockingSettings();
                }
            }
        }

        return instance;
    }
}
