package creation.singletonpattern.multithread.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListSingleton {
    private static final CopyOnWriteListSingleton instance = new CopyOnWriteListSingleton();

    private final CopyOnWriteArrayList<String> observers = new CopyOnWriteArrayList<>();

    private CopyOnWriteListSingleton() {}

    public static CopyOnWriteListSingleton getInstance() {
        return instance;
    }

    public void addObserver(String observer) {
        observers.add(observer);  // 쓰기 시 전체 배열 복사
    }

    public void removeObserver(String observer) {
        observers.remove(observer);  // 쓰기 시 전체 배열 복사
    }

    public void notifyObservers(String message) {
        // 읽기는 lock 없이 빠르게 수행
        for (String observer : observers) {
            System.out.println(observer + " received: " + message);
        }
    }

    public List<String> getObservers() {
        return new ArrayList<>(observers);  // 스냅샷 반환
    }

    public int getObserverCount() {
        return observers.size();
    }

    public void clear() {
        observers.clear();
    }
}
