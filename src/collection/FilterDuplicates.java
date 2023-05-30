package collection;

import java.util.*;

public class FilterDuplicates {
    public static void main(String[] args) {
        Collection<Integer> withDuplicates = new ArrayList<>(Arrays.asList(6, 99, 2, 6, -9, 6, 2, 99, 6, 7, 6, -9, 99));
        Collection<Integer> withoutDuplicates = new HashSet<>(withDuplicates);
        System.out.println("New collection of Integers without duplicates  " + withoutDuplicates);
    }
}
