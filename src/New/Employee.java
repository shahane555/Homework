package New;

class Employee extends Person {
    private String specialization;
    private int salary;

    Employee(String name, String surname, int age, String address, int phoneNumber, String specialization, int salary) {
        super(name, surname, age, address, phoneNumber);
        this.specialization = specialization;
        setSalary(salary);
    }

    public void setSalary(int salary) {
        if (salary >= 500 && salary <= 1000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }
}
