package GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int[] arr = {120, 36, 24, 240, 72, 120};
        int min = 2147483647; //max int range
        int greatestCommonDivisor = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 1; i <= min; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i == 0) {
                    count++;
                    continue;
                }
            }
            if(count == arr.length) {
                greatestCommonDivisor = i;
            }
        }
        System.out.println("Greatest common divisor is " + greatestCommonDivisor);
    }


}
