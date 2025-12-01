package creation.singletonpattern.multithread.solution;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapSingleton {
    private static final ConcurrentMapSingleton INSTANCE = new ConcurrentMapSingleton();

    private ConcurrentHashMap<Long, Integer> userScores = new ConcurrentHashMap<>();

    private ConcurrentMapSingleton() {
    }

    public static ConcurrentMapSingleton getInstance() {
        return INSTANCE;
    }

    public void updateScore(Long userId, int score) {
        userScores.put(userId, score);
    }

    public void incrementScore(Long userId) {
        userScores.compute(userId, (key, value) ->
                value == null ? 1 : value + 1
        );
    }

    public Integer getScore(Long userId) {
        return userScores.get(userId);
    }

    public int getScoreOrDefault(Long userId, Integer defaultValue) {
        return userScores.getOrDefault(userId, defaultValue);
    }

    public void clear() {
        userScores.clear();
    }

    public int getUserCount() {
        return userScores.size();
    }


}
