package creation.singletonpattern.multithread.solution;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicSingleton {
    private static final AtomicSingleton INSTANCE = new AtomicSingleton();

    private AtomicInteger counter = new AtomicInteger(0);
    private AtomicLong totalAmount = new AtomicLong(0L);
    private AtomicReference<String> status = new AtomicReference<>("READY");

    private AtomicSingleton() {}

    public static AtomicSingleton getInstance() {
        return INSTANCE;
    }

    public void incrementCounter() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public void resetCounter() {
        counter.set(0);
    }

    public void addAmount(long amount) {
        totalAmount.addAndGet(amount);
    }

    public long getTotalAmount() {
        return totalAmount.get();
    }

    public void resetAmount() {
        totalAmount.set(0L);
    }

    public void updateStatus(String newStatus) {
        status.set(newStatus);
    }

    public String getStatus() {
        return status.get();
    }

    public boolean compareAndSetStatus(String expect, String update) {
        return status.compareAndSet(expect, update);
    }
}
