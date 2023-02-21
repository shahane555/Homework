package GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int[] arr = {120, 36, 24, 12, 72, -240};
        System.out.println("Greatest common divisor for the current numbers is " + greatestCommonDivisor(arr));
    }

    static int greatestCommonDivisor(int... arr) {
        int min = 2147483647; //max value for a variable of type int
        int greatestCommonDivisor = 1;
        for (int i : arr) {
            if (i < min && -i < min) {
                min = i;
            }
        }
        for (int i = 1; i <= min || i <= -min; i++) {
            int count = 0;
            for (int j : arr) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == arr.length) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
