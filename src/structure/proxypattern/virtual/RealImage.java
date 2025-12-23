package structure.proxypattern.virtual;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("[RealImage] Loading image from disk: " + filename);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[RealImage] Image loaded: " + filename);
    }

    @Override
    public void display() {
        System.out.println("[RealImage] Displaying: " + filename);
    }
}
