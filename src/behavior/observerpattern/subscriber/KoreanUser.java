package behavior.observerpattern.subscriber;

import behavior.observerpattern.publisher.WeatherAPI;

public class KoreanUser implements Subscriber{

    private String name;

    public KoreanUser(String name) {
        this.name = name;
    }

    // pull 방식
    /*
    @Override
    public void display(WeatherAPI api) {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : 온도 - %.2f도, 습도 - %.2f, 기압 - %.2fhPa\n",
                name, api.getTemp(), api.getHumidity(), api.getPressure());
    }
     */

    // push 방식
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : 온도 - %.2f도, 습도 - %.2f, 기압 - %.2fhPa\n",
                name, temp, humidity, pressure);
    }
}
