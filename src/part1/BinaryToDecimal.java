package part1;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 1};
        int decimalResult = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[arr.length - 1 - i] = 2 * arr[arr.length - 1 - i];
            }
            decimalResult += arr[arr.length - 1 - i];
        }
        System.out.println(decimalResult);
    }

}
