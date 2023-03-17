package New;

class Employee extends Person {
    private String specialization;
    private int salary;

    Employee (String name, String surname, int age, String address, int phoneNumber, String specialization, int salary) {
        super(name, surname, age, address, phoneNumber);
        this.specialization = specialization;
        this.salary = salary;
    }
}
