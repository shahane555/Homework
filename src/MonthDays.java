import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12");
        int month = scan1.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + "th month" + " has 31 days.");
            case 4, 6, 9, 11 -> System.out.println(month + "th month" + " has 30 days.");
            case 2 -> System.out.println(month + "th month" + " has 28 or 29 days.");
            default -> {
                System.out.println("Invalid number! Enter a valid number between 1 to 12");
                System.exit(1);
            }
        }
    }
}
