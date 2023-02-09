package Part1;

public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] array = {11, 10, 19, 5, 7, 12, 77, 3, 55, 17, 70, 21, 33};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            boolean prime = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(array[i] + " ");
            } else counter++;
        }
        if (counter == array.length) {
            System.out.println("There are no prime numbers in current array");
        }
    }
}



