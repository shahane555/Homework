package list;

import dynamicArray.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 96, 4, 5, 96));
        LinkedList<Integer> numbers2 = new LinkedList<>(Arrays.asList(4, 96, 4, 5, 96));
        System.out.println(numbers.get(4).equals(numbers.get(2)));
        System.out.println(numbers2.get(1).equals(numbers2.get(4)));
        ArrayList<Student> student = new ArrayList<>(Arrays.asList(new Student("Anna", 19), new Student("Sona", 20), new Student("Anna", 19)));
        LinkedList<Student> students = new LinkedList<>(Arrays.asList(new Student("Anna", 19), new Student("Sona", 20), new Student("Anna", 19)));
        System.out.println(students.get(0).equals(students.get(2)));
        System.out.println(student.equals(students));
        ArrayList<String> a = new ArrayList<>(Arrays.asList("A", "K", "M", "H", "A"));
        LinkedList<String> a2 = new LinkedList<>(Arrays.asList("A", "K", "M", "H", "A"));
        System.out.println(a.get(0).equals(a.get(4)));
        System.out.println(a2.get(0).equals(a2.get(4)));
        System.out.println(a.equals(a2));

    }
}
