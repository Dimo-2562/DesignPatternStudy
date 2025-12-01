package creation.singletonpattern.multithread.problem;

public class ProblemDemo {
    public static void main(String[] args) throws InterruptedException {
        UnsafeSingleton singleton = UnsafeSingleton.getInstance();
        singleton.resetCounter();

        int threadCount = 10;
        int incrementPerThread = 10000;

        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementPerThread; j++) {
                    singleton.incrementCounter();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("=== Unsafe Singleton 결과 ===");
        System.out.println("예상 결과: " + (threadCount * incrementPerThread));
        System.out.println("실제 결과: " + singleton.getCounter());
        System.out.println("차이: " + (threadCount * incrementPerThread - singleton.getCounter()));

        if (singleton.getCounter() != threadCount * incrementPerThread) {
            System.out.println("Race Condition 발생!");
        } else {
            System.out.println("정상");
        }
    }
}
