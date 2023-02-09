package part1;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");
        int number = scan.nextInt();
        if (number < 1 || number > 12) {
            System.out.println("Invalid number! Enter valid number between 1 and 12!");
            System.exit(1);
        } else
            System.out.println("Corresponding minutes: " + 5 * number);
    }
}
