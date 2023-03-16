package New;

public class Person {
    public String name;
    public String surname;
    public int age;
    public String address;
    public int phoneNumber;
}

class Employee extends Person {
    public String specialization;
    public int salary;
}

class Manager extends Employee {
    public String Department;
}