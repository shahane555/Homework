package part2;

public class Eratosthene {
    public static void main(String[] args) {
        primeNumbers(70);
    }
    static void primeNumbers(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int k = 2; k <= n; k++) {
            if (arr[k])
                System.out.print(k + " ");
        }
    }
}







