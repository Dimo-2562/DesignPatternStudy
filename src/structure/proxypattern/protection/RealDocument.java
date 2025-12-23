package structure.proxypattern.protection;

public class RealDocument implements Document {
    private String title;
    private String content;

    public RealDocument(String title) {
        this.title = title;
        this.content = "Initial content of " + title;
    }

    @Override
    public void read() {
        System.out.println("[RealDocument] Reading document: " + title);
        System.out.println("Content: " + content);
    }

    @Override
    public void write(String content) {
        System.out.println("[RealDocument] Writing to document: " + title);
        this.content = content;
        System.out.println("New content saved: " + content);
    }
}
