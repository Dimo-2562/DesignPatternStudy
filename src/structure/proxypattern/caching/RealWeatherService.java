package structure.proxypattern.caching;

public class RealWeatherService implements WeatherService {
    @Override
    public String getWeather(String city) {
        System.out.println("[RealWeatherService] Calling external API for: " + city);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String weather = "Sunny, 25°C";
        System.out.println("[RealWeatherService] API response received");
        return weather;
    }
}
