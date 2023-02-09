package part1;

public class DoubleArray {
    public static void main(String[] args) {
        double[] array = {-5, -7, -9, 3, -6};
        double[] negative = new double[array.length];
        double[] positive = new double[array.length];
        int i = 2;
        int j = 0;
        if (array[0] >= 0) {
            positive[i] = array[0];
            i++;
        } else {
            negative[j] = array[0];
            j++;
        }
        if (array[1] >= 0) {
            positive[i] = array[1];
            i++;
        } else {
            negative[j] = array[1];
            j++;
        }
        if (array[2] >= 0) {
            positive[i] = array[2];
            i++;
        } else {
            negative[j] = array[2];
            j++;
        }
        if (array[3] >= 0) {
            positive[i] = array[3];
            i++;
        } else {
            negative[j] = array[3];
            j++;
        }
        if (array[4] >= 0) {
            positive[i] = array[4];
            i++;
        } else {
            negative[j] = array[4];
            j++;
        }
        System.out.print(positive[0] + ", ");
        System.out.print(positive[1] + ", ");
        System.out.print(positive[2] + ", ");
        System.out.print(positive[3] + ", ");
        System.out.print(positive[4] + ", ");
    }
}











