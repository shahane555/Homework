package Part1;

public class MaxArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {14, 2, 32, -8, -9, 10},
                {-8, 45,},
                {9, -1, 0, 8, 8, 55, 25, 7, 11, 41},
                {33, 41, 93, 0, 11, -1, 0}
        };
        int maxLengthOfArray = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > maxLengthOfArray) {
                maxLengthOfArray = matrix[i].length;
            }
        }
        System.out.println("The longest array in matrix array is");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i].length == maxLengthOfArray) {
                    System.out.print(matrix[i][j] + ", ");
                }
            }
        }
    }
}


