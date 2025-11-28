package behavior.observerpattern.subscriber;

import behavior.observerpattern.publisher.WeatherAPI;

public interface Subscriber {
    // void display(WeatherAPI api);

    void update(float temp, float humidity, float pressure);
}
