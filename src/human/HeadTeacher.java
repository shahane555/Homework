package human;

public class HeadTeacher extends Teacher {

    public HeadTeacher(String name, int age, double salary, double coefficient) {
        super(name, age, salary * coefficient);
    }
}



