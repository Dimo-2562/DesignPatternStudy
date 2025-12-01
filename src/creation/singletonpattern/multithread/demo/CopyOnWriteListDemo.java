package creation.singletonpattern.multithread.demo;

import creation.singletonpattern.multithread.solution.CopyOnWriteListSingleton;

public class CopyOnWriteListDemo {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteListSingleton singleton = CopyOnWriteListSingleton.getInstance();
        singleton.clear();

        int writerCount = 2;
        int readerCount = 8;
        int additionsPerWriter = 50;

        Thread[] writers = new Thread[writerCount];
        Thread[] readers = new Thread[readerCount];

        System.out.println("=== CopyOnWriteArrayList 테스트 시작 ===");
        System.out.println("Writer 스레드: " + writerCount);
        System.out.println("Reader 스레드: " + readerCount + "\n");

        // Writer 스레드들 - 옵저버 추가
        for (int i = 0; i < writerCount; i++) {
            final int writerId = i;
            writers[i] = new Thread(() -> {
                for (int j = 0; j < additionsPerWriter; j++) {
                    String observer = "Observer-" + writerId + "-" + j;
                    singleton.addObserver(observer);
                }
                System.out.println("Writer-" + writerId + " 완료");
            });
            writers[i].start();
        }

        // Reader 스레드들 - 반복적으로 옵저버 목록 조회
        for (int i = 0; i < readerCount; i++) {
            final int readerId = i;
            readers[i] = new Thread(() -> {
                int notificationCount = 0;
                for (int j = 0; j < 100; j++) {
                    int observerCount = singleton.getObserverCount();
                    if (observerCount > 0) {
                        notificationCount++;
                        singleton.notifyObservers("Reader-" + readerId + " 테스트 알림");
                    }

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Reader-" + readerId + " 완료 (알림 횟수: " + notificationCount + ")");
            });
            readers[i].start();
        }

        for (Thread writer : writers) {
            writer.join();
        }
        for (Thread reader : readers) {
            reader.join();
        }

        System.out.println("\n=== 결과 ===");
        int expectedObservers = writerCount * additionsPerWriter;
        int actualObservers = singleton.getObserverCount();

        System.out.println("예상 옵저버 수: " + expectedObservers);
        System.out.println("실제 옵저버 수: " + actualObservers);

        if (actualObservers == expectedObservers) {
            System.out.println("모든 쓰기 작업이 정확하게 수행됨!");
            System.out.println("읽기 중에도 ConcurrentModificationException 없이 안전하게 실행됨!");
        } else {
            System.out.println("오류 발생!");
        }
    }
}
