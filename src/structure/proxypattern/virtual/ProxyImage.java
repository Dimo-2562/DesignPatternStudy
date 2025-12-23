package structure.proxypattern.virtual;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
        System.out.println("[ProxyImage] Proxy created for: " + filename);
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("[ProxyImage] First time display - loading real image...");
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
