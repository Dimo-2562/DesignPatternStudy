package creation.singletonpattern.multithread.demo;

import creation.singletonpattern.multithread.solution.AtomicSingleton;

public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicSingleton singleton = AtomicSingleton.getInstance();
        singleton.resetCounter();
        singleton.resetAmount();

        int threadCount = 10;
        int incrementPerThread = 10000;

        Thread[] threads = new Thread[threadCount];

        System.out.println("=== Atomic 클래스 테스트 시작 ===");
        System.out.println("초기 상태: " + singleton.getStatus() + "\n");

        singleton.updateStatus("PROCESSING");

        for (int i = 0; i < threadCount; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementPerThread; j++) {
                    singleton.incrementCounter();
                    singleton.addAmount(10);
                }

                boolean changed = singleton.compareAndSetStatus("PROCESSING", "COMPLETED");
                if (changed) {
                    System.out.println("Thread-" + threadId + " 완료 (최초 완료 - 상태 변경 성공)");
                } else {
                    System.out.println("Thread-" + threadId + " 완료 (현재 상태: " + singleton.getStatus() + ")");
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int finalCounter = singleton.getCounter();
        long finalAmount = singleton.getTotalAmount();

        if (finalCounter == threadCount * incrementPerThread &&
                finalAmount == threadCount * incrementPerThread * 10L) {
            singleton.compareAndSetStatus("COMPLETED", "SUCCESS");
        } else {
            singleton.compareAndSetStatus("COMPLETED", "FAILED");
        }

        System.out.println("\n=== 결과 ===");
        System.out.println("최종 상태: " + singleton.getStatus());
        System.out.println("Counter 예상 결과: " + (threadCount * incrementPerThread));
        System.out.println("Counter 실제 결과: " + singleton.getCounter());
        System.out.println("Amount 예상 결과: " + (threadCount * incrementPerThread * 10L));
        System.out.println("Amount 실제 결과: " + singleton.getTotalAmount());

        if (singleton.getCounter() == threadCount * incrementPerThread &&
                singleton.getTotalAmount() == threadCount * incrementPerThread * 10L) {
            System.out.println("모든 연산이 정확하게 수행됨!");
        } else {
            System.out.println("오류 발생!");
        }
    }
}
