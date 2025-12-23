package structure.proxypattern.caching;

import java.util.HashMap;
import java.util.Map;

public class CachedWeatherProxy implements WeatherService {
    private RealWeatherService realService;
    private Map<String, String> cache;

    public CachedWeatherProxy() {
        this.realService = new RealWeatherService();
        this.cache = new HashMap<>();
    }

    @Override
    public String getWeather(String city) {
        System.out.println("[CachedWeatherProxy] Checking cache for: " + city);

        if (cache.containsKey(city)) {
            System.out.println("[CachedWeatherProxy] Cache hit! Returning cached data");
            return cache.get(city);
        }

        System.out.println("[CachedWeatherProxy] Cache miss - fetching from real service");
        String weather = realService.getWeather(city);
        cache.put(city, weather);
        System.out.println("[CachedWeatherProxy] Data cached for: " + city);

        return weather;
    }
}
