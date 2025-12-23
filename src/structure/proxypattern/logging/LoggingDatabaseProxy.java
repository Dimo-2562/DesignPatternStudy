package structure.proxypattern.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingDatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private DateTimeFormatter formatter;

    public LoggingDatabaseProxy() {
        this.realDatabase = new RealDatabase();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void insert(String data) {
        logBefore("insert", data);
        long start = System.currentTimeMillis();

        realDatabase.insert(data);

        long duration = System.currentTimeMillis() - start;
        logAfter("insert", duration);
    }

    @Override
    public String select(String query) {
        logBefore("select", query);
        long start = System.currentTimeMillis();

        String result = realDatabase.select(query);

        long duration = System.currentTimeMillis() - start;
        logAfter("select", duration);
        return result;
    }

    @Override
    public void delete(String id) {
        logBefore("delete", id);
        long start = System.currentTimeMillis();

        realDatabase.delete(id);

        long duration = System.currentTimeMillis() - start;
        logAfter("delete", duration);
    }

    private void logBefore(String method, String param) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("[LoggingProxy] " + timestamp + " - Method: " + method + "(" + param + ") - START");
    }

    private void logAfter(String method, long duration) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("[LoggingProxy] " + timestamp + " - Method: " + method + " - END (Duration: " + duration + "ms)");
    }
}
