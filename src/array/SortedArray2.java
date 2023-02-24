package array;

public class SortedArray2 {
    public static void main(String[] args) {
        int[] array = {12, -23, 5, 12, 5, 5, -23, 12, 5, 12, -23, 5, 5, 12, 5, -23, 12, 12, -23};
        int z;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
