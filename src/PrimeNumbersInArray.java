public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] array = {10, 11, 8, 9, 6, 7, 21, 25, 14, 29, 3, 4};
        boolean isPrime = true;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                } else isPrime = true;
            }
            if (isPrime) {
                System.out.print(array[i] + " ");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There are no prime numbers in current array");
        }
    }
}


