package creation.singletonpattern.multithread.demo;

import creation.singletonpattern.multithread.solution.SynchronizedSingleton;

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        singleton.clear();

        int threadCount = 10;
        int incrementPerThread = 10000;

        Thread[] threads = new Thread[threadCount];

        System.out.println("=== synchronized 테스트 시작 ===\n");

        for (int i = 0; i < threadCount; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementPerThread; j++) {
                    singleton.incrementCounter();
                    singleton.updateData("key-" + threadId, j);
                }
                System.out.println("Thread-" + threadId + " 완료");
            });
            threads[i].start();
        }

        // 모든 스레드가 끝날 때까지 대기
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("\n=== 결과 ===");
        int expectedCount = threadCount * incrementPerThread;
        int actualCount = singleton.getCounter();

        System.out.println("Counter 예상 결과: " + expectedCount);
        System.out.println("Counter 실제 결과: " + actualCount);

        // 각 스레드가 마지막에 저장한 값 확인
        boolean dataCorrect = true;
        for (int i = 0; i < threadCount; i++) {
            Integer value = singleton.getData("key-" + i);
            if (value == null || value != incrementPerThread - 1) {
                dataCorrect = false;
                System.out.println("key-" + i + " 예상: " + (incrementPerThread - 1) + ", 실제: " + value);
            }
        }

        if (actualCount == expectedCount && dataCorrect) {
            System.out.println("모든 연산이 정확하게 수행됨!");
        } else {
            System.out.println("오류 발생!");
        }
    }
}
