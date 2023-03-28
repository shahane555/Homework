package human;

public class Objects {
    public static void main(String[] args) {
        SchoolWorker anna = new SchoolWorker("Anna", 25, 90000);
        Teacher karine = new Teacher("Karine", 48, 100000);
        HeadTeacher sona = new HeadTeacher("Sona", 39, 100000, 1.7);
        SchoolWorker s;
        s = anna;
        System.out.println("Total salary is " + s.getSalary());
        s = karine;
        System.out.println("Total salary is " + s.getSalary());
        s = sona;
        System.out.println("Total salary is " + s.getSalary());
    }
}
