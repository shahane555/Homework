package New;

class Manager extends Employee {
    private String department;

    Manager(String name, String surname, int age, String address, int phoneNumber, String specialization, int salary, String  department) {
        super(name, surname, age, address, phoneNumber, specialization, salary);
        this.department = department;
    }
}
