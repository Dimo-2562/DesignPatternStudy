package structure.decoratorpattern.decorator;

import structure.decoratorpattern.component.Notifier;

public class SMSDecorator extends BaseDecorator{

    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[SMS] " + message);
    }
}
