package Part2;

public class PascalsTriangle {
    public static void main(String[] args) {
        int number = 15;
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                long result = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }

    static long factorial(int a) {
        long factorial = 1;
        for (int i = 0; i < a; i++) {
            factorial *= (a - i);
        }
        if (a == 0) {
            return 1;
        }
        return factorial;


    }

}




