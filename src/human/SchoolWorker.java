package human;

public class SchoolWorker {
    private String name;
    private int age;
    private double salary;

    public SchoolWorker(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 21 && age <= 62) {
            this.age = age;
        } else {
            System.out.println("Age is invalid");
            System.exit(1);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 60000) {
            this.salary = salary;
        } else {
            System.out.println("Salary is invalid");
            System.exit(1);
        }
    }
}
