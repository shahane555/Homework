package collection;

import java.util.*;

public class SortedCollection {
    public static void main(String[] args) {

        Collection<Integer> cl = new PriorityQueue<>();
        PriorityQueue<Integer> c = new PriorityQueue<>(Arrays.asList(14, 5, 9, -7, 100, 3, 31, 0));
        while (!c.isEmpty()) {
            cl.add(c.poll());
        }
        System.out.println(cl);

        System.out.println("After cleaning the collection");
        cl.clear();
        if (cl.isEmpty()) {
            System.out.println("Collection is empty");
        } else throw new RuntimeException();
    }
}
