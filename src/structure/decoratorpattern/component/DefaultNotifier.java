package structure.decoratorpattern.component;

public class DefaultNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[Email] " + message);
    }
}
