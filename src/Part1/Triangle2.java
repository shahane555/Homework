package Part1;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Triangle with " + a + ", " + b + ", " + c + " sides is exist.");
        } else {
            System.out.println("Triangle with " + a + ", " + b + ", " + c + " sides doesn't exist.");
        }
    }
}

