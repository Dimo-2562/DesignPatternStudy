package structure.proxypattern.logging;

public class LoggingProxyClient {
    public static void main(String[] args) {
        System.out.println("=== Logging Proxy Pattern: Method Call Logging ===\n");

        Database db = new LoggingDatabaseProxy();

        System.out.println("--- Insert operation ---");
        db.insert("User: John Doe");

        System.out.println("\n--- Select operation ---");
        String result = db.select("SELECT * FROM users WHERE id=1");
        System.out.println("Query result: " + result);

        System.out.println("\n--- Delete operation ---");
        db.delete("123");
    }
}
