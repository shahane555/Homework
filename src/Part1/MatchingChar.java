package Part1;

import java.util.Scanner;

public class MatchingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char enteredChar = sc.next().charAt(0);
        char[] array = {'h', 'u', 'd', 'M', 'I', 'w', 'g', 'G', 'S', 'z', 'Y'};
        int i = 0;
        int j = 0;
        while (i < array.length) {
            if (enteredChar == array[i]) {
                break;
            } else j++;
            i++;
        }
        if (j == 11) {
            System.out.println("There's no matching character in array");
        } else System.out.println("The index of matching character is " + i);
    }
}
