package list;

import dynamicArray.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<Integer> numbers = new LinkedList<>(Arrays.asList(5, 6, 9, 74, -5, 0, 45, 18));
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student("Anna", 19), new Student("Sona", 20)));
        LinkedList<Double> numbers2 = new LinkedList<>(Arrays.asList(14.6, 23.9, 241.4, -10.4, 47.6));
        List<List> printInfo = new ArrayList<>(Arrays.asList(letters, numbers, students, numbers2));
        for (List l : printInfo) {
            System.out.println(printList(l));
        }
    }

    public static List printList(List<?> l) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) instanceof Number && ((Number) l.get(i)).intValue() < 0) {
                return l.subList(0, i);
            }
        }
        return l;
    }
}

