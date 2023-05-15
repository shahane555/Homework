package dynamicArray;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age >= 17) {
            this.age = age;
        } else throw new AgeException();
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }
}
