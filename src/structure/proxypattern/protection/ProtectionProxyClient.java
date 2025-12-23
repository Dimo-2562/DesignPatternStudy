package structure.proxypattern.protection;

public class ProtectionProxyClient {
    public static void main(String[] args) {
        System.out.println("=== Protection Proxy Pattern: Access Control ===\n");

        User admin = new User("Alice", User.Role.ADMIN);
        User regularUser = new User("Bob", User.Role.USER);
        User guest = new User("Charlie", User.Role.GUEST);

        System.out.println("--- Admin accessing document ---");
        Document adminDoc = new ProtectedDocument("Secret.txt", admin);
        adminDoc.read();
        adminDoc.write("Admin updated content");

        System.out.println("\n--- Regular user accessing document ---");
        Document userDoc = new ProtectedDocument("Report.txt", regularUser);
        userDoc.read();
        userDoc.write("User updated content");

        System.out.println("\n--- Guest accessing document ---");
        Document guestDoc = new ProtectedDocument("Public.txt", guest);
        guestDoc.read();
        guestDoc.write("Guest trying to write");
    }
}
