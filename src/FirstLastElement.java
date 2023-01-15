public class FirstLastElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 32, -8, -9, 10},
                {-8, 45,},
                {9, -1, 0, 41,},
                {33, 41, 93, 0, 11, -1, 0}
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("First element of the array N" + (i + 1) + " is " + matrix[i][0]);
            System.out.println("Last element of the array N" + (i + 1) + " is " + matrix[i][matrix[i].length - 1] + "\n");

        }
    }
}

