package structure.decoratorpattern;

import structure.decoratorpattern.component.Notifier;

public class Application {

    private Notifier notifier;

    public Application(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendMessage(String message) {
        notifier.send(message);
    }
}
