package structure.decoratorpattern.decorator;

import structure.decoratorpattern.component.Notifier;

public class SlackDecorator extends BaseDecorator{

    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[Slack] " + message);
    }
}
