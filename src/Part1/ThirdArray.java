package Part1;

public class ThirdArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 30, -56, 4, -61, 8, -3, 0, 40, 29};
        int[] arr2 = {25, 2, 14, 3, 77, 18, 55, 1, -6, 31};
        int[] arr3 = new int[arr2.length];
        System.out.println("arr3 will contain the following numbers");
        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] % 2 == 1 || arr1[i] % 2 == -1) && arr2[i] % 2  == 1) {
                arr3[i] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[i] = arr2[i];
            } else arr3[i] = 0;
            System.out.print(arr3[i] + ", ");
        }
    }
}


