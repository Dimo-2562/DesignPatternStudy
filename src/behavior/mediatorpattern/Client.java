package behavior.mediatorpattern;

import behavior.mediatorpattern.mediator.ConcreteMediator;
import behavior.mediatorpattern.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Component user1 = new Component(mediator, "A");
        Component user2 = new Component(mediator, "B");

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hello World");
        System.out.println();
        user2.send("Who are you?");
    }
}
