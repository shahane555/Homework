package New;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    private int phoneNumber;

    Person(String name, String surname, int age, String address, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.address = address;
       setPhoneNumber(phoneNumber);
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }
    public int getAge() {
        return age;
    }

    public void setPhoneNumber(int phoneNumber) {
        if(phoneNumber >= 10000000 && phoneNumber <= 99000000) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}