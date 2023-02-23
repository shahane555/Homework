package array;

public class SortedArray {
    public static void main(String[] args) {
        int[] array = {-23, 5, 12, 5, 5, -23, 12, 5, 12, -23, 5, 5, 12, 5, -23, 12, 12, -23};
        int[] sortedArray = new int[array.length];
        int[] arr = {-23, 5, 12};
        int repeatedNumbers = 0;
        int copyOfRepeatedNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            copyOfRepeatedNumbers += repeatedNumbers;
            repeatedNumbers = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == arr[i]) {
                    repeatedNumbers++;
                }
            }
            for (int k = copyOfRepeatedNumbers; k < copyOfRepeatedNumbers + repeatedNumbers; k++) {
                sortedArray[k] = arr[i];
                System.out.print(sortedArray[k] + " ");
            }
        }
    }
}
