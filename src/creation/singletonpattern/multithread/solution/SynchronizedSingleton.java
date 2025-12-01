package creation.singletonpattern.multithread.solution;

import java.util.HashMap;
import java.util.Map;

public class SynchronizedSingleton {
    private static final SynchronizedSingleton instance = new SynchronizedSingleton();

    private final Map<String, Integer> data = new HashMap<>();
    private int counter = 0;

    private SynchronizedSingleton() {}

    public static SynchronizedSingleton getInstance() {
        return instance;
    }

    // 메서드 전체 동기화
    public synchronized void updateData(String key, int value) {
        data.put(key, value);
    }

    public synchronized Integer getData(String key) {
        return data.get(key);
    }

    public synchronized void incrementCounter() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }

    // 블록 단위 동기화
    public void updateDataBlock(String key, int value) {
        synchronized(this) {
            data.put(key, value);
        }
    }

    public synchronized void clear() {
        data.clear();
        counter = 0;
    }
}
