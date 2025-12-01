package creation.singletonpattern.multithread.demo;

import creation.singletonpattern.multithread.solution.ReadWriteLockSingleton;

public class ReadWriteLockDemo {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockSingleton singleton = ReadWriteLockSingleton.getInstance();
        singleton.clear();

        int writerCount = 2;
        int readerCount = 8;
        int operationsPerThread = 1000;

        Thread[] writers = new Thread[writerCount];
        Thread[] readers = new Thread[readerCount];

        System.out.println("=== ReadWriteLock 테스트 시작 ===");
        System.out.println("Writer 스레드: " + writerCount);
        System.out.println("Reader 스레드: " + readerCount + "\n");

        for (int i = 0; i < writerCount; i++) {
            final int writerId = i;
            writers[i] = new Thread(() -> {
                for (int j = 0; j < operationsPerThread; j++) {
                    String key = "key-" + (writerId * operationsPerThread + j);
                    String value = "value-" + (writerId * operationsPerThread + j);
                    singleton.putData(key, value);
                }
                System.out.println("Writer-" + writerId + " 완료");
            });
            writers[i].start();
        }

        for (int i = 0; i < readerCount; i++) {
            final int readerId = i;
            readers[i] = new Thread(() -> {
                int readCount = 0;
                for (int j = 0; j < operationsPerThread * 10; j++) {
                    int size = singleton.getSize();
                    if (size > 0) {
                        readCount++;
                    }
                }
                System.out.println("Reader-" + readerId + " 완료 (읽은 횟수: " + readCount + ")");
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
        int expectedSize = writerCount * operationsPerThread;
        int actualSize = singleton.getSize();

        System.out.println("예상 데이터 개수: " + expectedSize);
        System.out.println("실제 데이터 개수: " + actualSize);

        if (actualSize == expectedSize) {
            System.out.println("모든 쓰기 작업이 정확하게 수행됨!");
            System.out.println("읽기 작업도 동시에 안전하게 실행됨!");
        } else {
            System.out.println("오류 발생!");
        }
    }
}
