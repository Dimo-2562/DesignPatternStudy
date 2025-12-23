package structure.flyweightpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String fontName) {
        if (cache.containsKey(fontName)) {
            return cache.get(fontName);
        } else {
            String[] split = fontName.split(":");
            String family = split[0];
            int size = Integer.parseInt(split[1]);
            Font newFont = new Font(family, size);
            cache.put(fontName, newFont);
            return newFont;
        }
    }
}
