package part2;

public class Armstrong {
    public static void main(String[] args) {
        if (isArmstrong(548834)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }

    static int lengthOfNum(int a) {
        int counter = 0;
        while (a > 0) {
            a = a / 10;
            counter++;
        }
        return counter;
    }
    static boolean isArmstrong(int a) {
        int digit = 0;
        int result = 0;
        int copyOfa = a;
        while (copyOfa != 0) {
            int pow = 1;
            digit = copyOfa % 10;
            copyOfa = copyOfa / 10;
            for (int i = 0; i < lengthOfNum(a); i++) {
                pow *= digit;
            }
            result += pow;
        }
        return result == a;
    }

    private static class Strings {
    }
}