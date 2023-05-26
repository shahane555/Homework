package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 7, 5, 6, 99, 7, 12, 0));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num.equals(7)) {
                iterator.remove();
            }
        }
        if (!list.contains(7)) {
            System.out.println("ArrayList doesn't contain 7");
        }
    }
}
