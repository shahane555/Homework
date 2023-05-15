package dynamicArray;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        try {
            students.add(new Student("Ani", 18));
            students.add(new Student("Armen", 19));
            students.add(new Student("Sona", 19));
        } catch (AgeException e) {
            System.out.println("Invalid age");
        }
        students.add(0, new Student("Anna", 21));
        students.remove(1);
        students.set(2, new Student("Sona", 20));
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}

