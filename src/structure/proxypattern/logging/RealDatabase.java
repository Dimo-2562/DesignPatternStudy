package structure.proxypattern.logging;

public class RealDatabase implements Database {
    @Override
    public void insert(String data) {
        System.out.println("[RealDatabase] Inserting data: " + data);
    }

    @Override
    public String select(String query) {
        System.out.println("[RealDatabase] Executing query: " + query);
        return "Result of " + query;
    }

    @Override
    public void delete(String id) {
        System.out.println("[RealDatabase] Deleting record with id: " + id);
    }
}
