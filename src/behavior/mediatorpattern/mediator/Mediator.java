package behavior.mediatorpattern.mediator;

import behavior.mediatorpattern.Component;

public interface Mediator {
    void sendMessage(Component sender, String message);
    void addUser(Component user);
}
