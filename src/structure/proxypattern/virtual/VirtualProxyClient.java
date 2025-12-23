package structure.proxypattern.virtual;

public class VirtualProxyClient {
    public static void main(String[] args) {
        System.out.println("=== Virtual Proxy Pattern: Lazy Loading ===\n");

        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("\n--- First display of image1 ---");
        image1.display();

        System.out.println("\n--- Second display of image1 (cached) ---");
        image1.display();

        System.out.println("\n--- First display of image2 ---");
        image2.display();
    }
}
