package structure.proxypattern.caching;

public class CachingProxyClient {
    public static void main(String[] args) {
        System.out.println("=== Caching Proxy Pattern: Performance Optimization ===\n");

        WeatherService weatherService = new CachedWeatherProxy();

        System.out.println("--- First request for Seoul ---");
        long start1 = System.currentTimeMillis();
        String weather1 = weatherService.getWeather("Seoul");
        long end1 = System.currentTimeMillis();
        System.out.println("Weather: " + weather1);
        System.out.println("Time taken: " + (end1 - start1) + "ms");

        System.out.println("\n--- Second request for Seoul (cached) ---");
        long start2 = System.currentTimeMillis();
        String weather2 = weatherService.getWeather("Seoul");
        long end2 = System.currentTimeMillis();
        System.out.println("Weather: " + weather2);
        System.out.println("Time taken: " + (end2 - start2) + "ms");

        System.out.println("\n--- First request for Tokyo ---");
        long start3 = System.currentTimeMillis();
        String weather3 = weatherService.getWeather("Tokyo");
        long end3 = System.currentTimeMillis();
        System.out.println("Weather: " + weather3);
        System.out.println("Time taken: " + (end3 - start3) + "ms");
    }
}
