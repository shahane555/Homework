public class NextBiggerNumber {
    public static void main(String[] args) {
        int[] array = {12, 32, -9, 11, -1, 0, 1, 30, 12, 65, 9, 45, -9, 2, 29};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - 1]) {
                break;
            } else if (array[i] < array[i + 1]) {
                j++;
            }
        }
        System.out.println("Numbers' count greater than their preceding number is " + j);
    }
}
