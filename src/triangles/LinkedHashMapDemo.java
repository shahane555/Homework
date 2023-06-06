package triangles;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Triangle, String> map = new LinkedHashMap<>();

        Triangle red = new Triangle(new Coordinate(5, 9), new Coordinate(-1, 7), new Coordinate(2, -3));
        Triangle green = new Triangle(new Coordinate(1, 10), new Coordinate(8, -4), new Coordinate(6, 11));
        Triangle yellow = new Triangle(new Coordinate(4, 4), new Coordinate(-7, 3), new Coordinate(-5, -7));
        Triangle blue = new Triangle(new Coordinate(9, 2), new Coordinate(-9, 2), new Coordinate(4, 9));

        map.put(red, "Red");
        map.put(green, "Green");
        map.put(yellow, "Yellow");
        map.put(blue, "Blue");

        System.out.println("The colour of the triangle \"red\" is " + map.get(red));
        System.out.println("The colour of the triangle \"yellow\" is " + map.get(yellow));
        System.out.println();

        for (Map.Entry<Triangle, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + ", " + pair.getValue());
        }
    }
}
