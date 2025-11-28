package behavior.mediatorpattern;

import behavior.mediatorpattern.mediator.Mediator;

public class Component {
    private Mediator mediator;
    private String name;

    public Component(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void receive(String message) {
        System.out.println("[수신] > " + this.name + " : " + message);
    }

    public void send(String message) {
        System.out.println("[발신] > " + this.name + " : " + message);
        mediator.sendMessage(this, message);
    }
}
