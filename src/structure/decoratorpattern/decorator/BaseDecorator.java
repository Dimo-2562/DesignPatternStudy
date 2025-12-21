package structure.decoratorpattern.decorator;

import structure.decoratorpattern.component.Notifier;

public abstract class BaseDecorator implements Notifier {

    private Notifier wrappee;

    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
