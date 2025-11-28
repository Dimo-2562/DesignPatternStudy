package behavior.observerpattern;

import behavior.observerpattern.publisher.WeatherAPI;
import behavior.observerpattern.subscriber.KoreanUser;

public class Client {
    public static void main(String[] args) {
        WeatherAPI weatherAPI = new WeatherAPI();

        weatherAPI.register(new KoreanUser("홍길동"));
        weatherAPI.register(new KoreanUser("임꺽정"));
        weatherAPI.register(new KoreanUser("세종대왕"));

        weatherAPI.measurementsChanged();
    }
}
