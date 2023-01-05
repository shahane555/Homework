import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//        __________1st task___________
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Triangle with " + a + ", " + b + ", " + c + " sides is exist.");
        } else {
            System.out.println("Triangle with " + a + ", " + b + ", " + c + " sides doesn't exist.");
        }

//       ___________2nd task____________
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12");
        int month = scan1.nextInt();
        String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(arr[month - 1] + " has 31 days.");
            case 4, 6, 9, 11 -> System.out.println(arr[month - 1] + " has 30 days.");
            case 2 -> System.out.println(arr[month - 1] + " has 28 or 29 days.");
            default -> {
                System.out.println("Invalid number! Enter a valid number between 1 to 12");
                System.exit(1);
            }
        }

    }
}

