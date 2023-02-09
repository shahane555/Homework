package Part1;

public class AbsoluteValue {
    public static void main(String[] args) {
        int[] array = {62, -9, -2, 0, 14, -77, 25, 29, 14, 3, 11, -6, -8, 0};
        int i, j, k;
        System.out.println("Array after turning negative numbers into their absolute value");
        for (i = 0, j = 0, k = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
                j++;
            } else k++;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("The count of non negative numbers before turning negative numbers into their absolute value is " + k);
        System.out.println("The count of negative numbers turned into their absolute value is " + j);
    }


}


