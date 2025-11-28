package behavior.mediatorpattern.mediator;

import behavior.mediatorpattern.Component;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Component> users;

    public ConcreteMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(Component sender, String message) {
        for (Component receiver : users) {
            if (sender != receiver) receiver.receive(message);
        }
    }

    @Override
    public void addUser(Component user) {
        this.users.add(user);
    }
}
