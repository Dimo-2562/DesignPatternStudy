package structure.proxypattern.protection;

public class ProtectedDocument implements Document {
    private RealDocument realDocument;
    private User user;

    public ProtectedDocument(String title, User user) {
        this.realDocument = new RealDocument(title);
        this.user = user;
    }

    @Override
    public void read() {
        System.out.println("[ProtectedDocument] Checking read permission for: " + user.getName());
        if (hasReadPermission()) {
            System.out.println("[ProtectedDocument] Read permission granted");
            realDocument.read();
        } else {
            System.out.println("[ProtectedDocument] Access denied - insufficient permissions");
        }
    }

    @Override
    public void write(String content) {
        System.out.println("[ProtectedDocument] Checking write permission for: " + user.getName());
        if (hasWritePermission()) {
            System.out.println("[ProtectedDocument] Write permission granted");
            realDocument.write(content);
        } else {
            System.out.println("[ProtectedDocument] Access denied - insufficient permissions");
        }
    }

    private boolean hasReadPermission() {
        return user.getRole() == User.Role.ADMIN ||
               user.getRole() == User.Role.USER ||
               user.getRole() == User.Role.GUEST;
    }

    private boolean hasWritePermission() {
        return user.getRole() == User.Role.ADMIN ||
               user.getRole() == User.Role.USER;
    }
}
