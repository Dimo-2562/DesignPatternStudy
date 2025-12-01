package creation.singletonpattern.multithread.demo;

import creation.singletonpattern.multithread.solution.ConcurrentMapSingleton;

public class ConcurrentMapDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentMapSingleton singleton = ConcurrentMapSingleton.getInstance();
        singleton.clear();

        int threadCount = 10;
        int incrementPerThread = 10000;
        Long[] userIds = {1L, 2L, 3L, 4L, 5L};

        Thread[] threads = new Thread[threadCount];

        System.out.println("=== ConcurrentHashMap 테스트 시작 ===\n");

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementPerThread; j++) {
                    for (Long userId : userIds) {
                        singleton.incrementScore(userId);
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("\n=== 결과 ===");
        int expectedScore = threadCount * incrementPerThread;

        boolean allCorrect = true;
        for (Long userId : userIds) {
            int actualScore = singleton.getScoreOrDefault(userId, 0);
            System.out.println(userId + " 예상: " + expectedScore + ", 실제: " + actualScore);

            if (actualScore != expectedScore) {
                allCorrect = false;
            }
        }

        if (allCorrect) {
            System.out.println("모든 유저의 점수가 정확하게 계산됨!");
        } else {
            System.out.println("오류 발생!");
        }
    }

}
