package human;

public class HeadTeacher extends Teacher {
    private double coefficient;

    public HeadTeacher(String name, int age, double salary, double coefficient) {
        super(name, age, salary);
        if (coefficient >= 1.5 && coefficient <= 2) {
            this.coefficient = coefficient;
            setSalary(salary * coefficient);
        } else {
            System.out.println("Invalid coefficient");
            System.exit(1);
        }
    }
}



