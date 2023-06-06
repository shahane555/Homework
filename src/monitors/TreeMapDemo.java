package monitors;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Monitor, String> map = new TreeMap<>();

        Monitor m1 = new Monitor(32, 1920, 1080);
        Monitor m2 = new Monitor(27.5, 1600, 1024);

        map.put(m1, " Samsung / 2020");
        map.put(m2, " LG / 2014");

        System.out.println(map.get(m1));
        System.out.println(map.get(m2) + "\n");
        System.out.println(map + "\n");

        for (Map.Entry<Monitor, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + "," + pair.getValue());
        }
    }
}
