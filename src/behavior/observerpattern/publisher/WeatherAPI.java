package behavior.observerpattern.publisher;

import behavior.observerpattern.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherAPI implements Publisher {
    private float temp;
    private float humidity;
    private float pressure;

    List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void inform() {
        for(Subscriber subscriber : subscribers) {
            subscriber.display(this);
        }
    }

    public void measurementsChanged() {
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;

        inform();
    }


}
