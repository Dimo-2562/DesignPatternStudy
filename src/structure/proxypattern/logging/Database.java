package structure.proxypattern.logging;

public interface Database {
    void insert(String data);
    String select(String query);
    void delete(String id);
}
