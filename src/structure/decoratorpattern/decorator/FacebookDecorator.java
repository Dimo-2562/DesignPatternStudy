package structure.decoratorpattern.decorator;

import structure.decoratorpattern.component.Notifier;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[Facebook] " + message);
    }
}
