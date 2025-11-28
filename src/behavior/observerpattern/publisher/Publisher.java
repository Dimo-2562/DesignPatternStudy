package behavior.observerpattern.publisher;

import behavior.observerpattern.subscriber.Subscriber;

public interface Publisher {
    void register(Subscriber subscriber);
    void remove(Subscriber subscriber);
    void inform();
}
