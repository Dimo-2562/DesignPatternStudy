package structure.decoratorpattern;

import structure.decoratorpattern.component.EmailNotifier;
import structure.decoratorpattern.component.Notifier;
import structure.decoratorpattern.decorator.FacebookDecorator;
import structure.decoratorpattern.decorator.SMSDecorator;
import structure.decoratorpattern.decorator.SlackDecorator;

public class Main {
    public static void main(String[] args) {
        boolean facebookEnabled = true;
        boolean smsEnabled = false;
        boolean slackEnabled = true;

        Notifier notifier = new EmailNotifier();

        if (facebookEnabled) {
            notifier = new FacebookDecorator(notifier);
        }

        if (smsEnabled) {
            notifier = new SMSDecorator(notifier);
        }

        if (slackEnabled) {
            notifier = new SlackDecorator(notifier);
        }

        Application app = new Application(notifier);
        app.sendMessage("Hello World!");

    }
}
